package ru.isko.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.isko.security.role.Role;
import ru.isko.services.AuthenticationService;

/**
 * created by Iskander Valiev
 * on 11/22/17
 *
 * @author Iskander Valiev (Kazan Federal University Higher School of Information Technologies and Information Systems)
 * @version 1.0
 */
@Controller
public class RedirectController {

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/homepage")
    public String getHomepage(Authentication authentication) {
        if (authenticationService.getUser(authentication).getRole().equals(Role.ADMIN)) {
            return "redirect:/admin/homepage";
        } else if (authenticationService.getUser(authentication).getRole().equals(Role.USER)) {
            return "redirect:/user/homepage";
        }
        return "redirect:/signin";
    }

    @GetMapping("/contacts")
    public String getContactsPage(Authentication authentication) {
        if (authenticationService.getUser(authentication).getRole().equals(Role.ADMIN)) {
            return "redirect:/admin/contacts";
        } else if (authenticationService.getUser(authentication).getRole().equals(Role.ADMIN)) {
            return "redirect:/user/contacts";
        }
        return "redirect:/singin";
    }
}
