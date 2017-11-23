package ru.isko.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * created by Iskander Valiev
 * on 11/22/17
 *
 * @author Iskander Valiev (Kazan Federal University Higher School of Information Technologies and Information Systems)
 * @version 1.0
 */
@Controller
public class RedirectController {

    @GetMapping("/user/homepage")
    public String getHomepage() {
        return "homepage";
    }
}
