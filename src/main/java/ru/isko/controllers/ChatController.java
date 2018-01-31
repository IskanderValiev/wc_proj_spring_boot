package ru.isko.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * created by Iskander Valiev
 * on 1/31/18
 *
 * @author Iskander Valiev (Kazan Federal University Higher School of Information Technologies and Information Systems)
 * @version 1.0
 */
@Controller
public class ChatController {

    @GetMapping("/user/chat")
    public String openChat() {
        return "chat";
    }
}
