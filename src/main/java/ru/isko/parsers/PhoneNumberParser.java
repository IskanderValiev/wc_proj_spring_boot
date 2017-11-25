package ru.isko.parsers;

/**
 * created by Iskander Valiev
 * on 11/25/17
 *
 * @author Iskander Valiev (Kazan Federal University Higher School of Information Technologies and Information Systems)
 * @version 1.0
 */

public class PhoneNumberParser {

    public String phoneParse(String phoneNumber) {
        phoneNumber.toCharArray()[0] = '7';
        return phoneNumber;
    }
}
