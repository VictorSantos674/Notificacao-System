package com.notificacao.service;

import java.util.List;

public class NotificationService {
    private final NotificationRepository repository;
    
    public NotificationService(NotificationRepository repository) {
        this.repository = repository;
    }
    
    public void processNotifications() {
        List<Notification> notifications = repository.findPendingNotifications();
        for (Notification notification : notifications) {
            repository.updateStatus(notification.getId(), "SENT");
        }
    }
}

