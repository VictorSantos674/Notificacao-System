package com.notificacao.utils;

public class NotificationUtils {
    public static boolean validateMessage(String message) {
        return message != null && !message.trim().isEmpty();
    }
}