package ru.isko.services;

public interface SystemService {

    void generateLink(Long userId);
    void generateTempPassword(Long userId);
}
