package com.notificacao.producer;

import java.util.concurrent.BlockingQueue;

public class NotificationProducer implements Runnable {
    private final BlockingQueue<Notification> queue;
    
    public NotificationProducer(BlockingQueue<Notification> queue) {
        this.queue = queue;
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                Notification notification = new Notification();
                notification.setMessage("New notification");
                queue.put(notification);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}