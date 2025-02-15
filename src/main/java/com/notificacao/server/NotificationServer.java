package com.notificacao.service;

import java.net.ServerSocket;
import java.net.Socket;

public class NotificationServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8081)) {
            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(() -> handleClient(socket)).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void handleClient(Socket socket) {
        // Lógica de processamento da conexão
    }
}