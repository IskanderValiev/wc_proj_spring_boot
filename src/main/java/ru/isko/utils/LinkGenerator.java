package ru.isko.utils;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * created by Iskander Valiev
 * on 11/18/17
 *
 * @author Iskander Valiev (Kazan Federal University Higher School of Information Technologies and Information Systems)
 * @version 1.0
 */
@Component
public class LinkGenerator {

    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String PUNCTUATION = "_-~.";

    public String generate() {
        return generate((LOWER + UPPER + DIGITS + PUNCTUATION).toCharArray(), 20);
    }

    private String generate(char[] chars, int length) {
        char[] link = new char[length];
        Random random = new Random(System.nanoTime());
        for (int i = 0; i < length; i++) {
            link[i] = chars[random.nextInt(chars.length)];
        }
        return new String(link);
    }

}