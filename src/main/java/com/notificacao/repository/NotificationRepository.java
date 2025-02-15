package com.notificacao.repository;

import java.util.List;

public interface NotificationRepository {
    void save(Notification notification);
    List<Notification> findPendingNotifications();
    void updateStatus(Long id, String status);
}

