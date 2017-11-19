package ru.isko.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.isko.services.AdminService;

/**
 * created by Iskander Vaiev
 * on 11/17/17
 *
 * @author Iskander Valiev (Kazan Federal University Higher School of Information Technologies and Information Systems)
 * @version 1.0
 */

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/profile")
    public String getAdminPage(@ModelAttribute("model") ModelMap model) {
        return "profile";
    }

    @GetMapping
    public String getNewPasswordOfUserPage(@ModelAttribute("model") ModelMap modelMap, @PathVariable("user-id") Long userId) {
        adminService.generateTempPassword(userId);
        return "";
    }
}
