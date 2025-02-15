package com.notificacao.consumer;

import java.util.concurrent.BlockingQueue;

public class NotificationConsumer implements Runnable {
    private final BlockingQueue<Notification> queue;
    
    public NotificationConsumer(BlockingQueue<Notification> queue) {
        this.queue = queue;
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                Notification notification = queue.take();
                System.out.println("Processing notification: " + notification.getMessage());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}