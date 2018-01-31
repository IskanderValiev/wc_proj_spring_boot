package ru.isko.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import ru.isko.models.Message;

/**
 * created by Iskander Valiev
 * on 1/31/18
 *
 * @author Iskander Valiev (Kazan Federal University Higher School of Information Technologies and Information Systems)
 * @version 1.0
 */
@Controller
public class MessageController {

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/message")
    public Message sendMessage(@Payload Message message) {
        return message;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public Message addUser(@Payload Message message, SimpMessageHeaderAccessor headerAccessor) {
        //add username in web socket session
        headerAccessor.getSessionAttributes().put("username", message.getSender().getName() + " " + message.getSender().getLastname());
        return message;
    }
}
