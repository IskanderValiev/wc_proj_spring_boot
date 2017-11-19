package ru.isko.services;

public interface EmailService {
    void sendMail(String text, String subject, String email);
}
