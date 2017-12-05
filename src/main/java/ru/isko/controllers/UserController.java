package ru.isko.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.isko.forms.CommentsForm;
import ru.isko.forms.EditProfileForm;
import ru.isko.models.News;
//import ru.isko.repositories.news.CustomNewsRepository;
import ru.isko.repositories.countries.CountriesRepository;
import ru.isko.repositories.news.NewsRepository;
import ru.isko.services.AuthenticationService;
import ru.isko.services.NewsService;
import ru.isko.services.UserService;

import java.util.List;

/**
 * created by Iskander Valiev
 * on 11/26/17
 *
 * @author Iskander Valiev (Kazan Federal University Higher School of Information Technologies and Information Systems)
 * @version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private NewsRepository newsRepository;

    @Autowired
    private NewsService newsService;

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private UserService userService;

    @Autowired
    private CountriesRepository countriesRepository;


//    @Qualifier("customNewsRepositoryImpl")
//    @Autowired
//    private CustomNewsRepository customNewsRepository;

    @GetMapping("/homepage")
    public String openHomepage(@ModelAttribute("model")ModelMap model) {
        return "homepage";
    }

    @GetMapping("/contacts")
    public String openContacts() {
        return "contacts";
    }

    @GetMapping("/editprofile")
    public String openEditProfilePage(@ModelAttribute("model")ModelMap model, Authentication authentication) {
        model.addAttribute("user", authenticationService.getUser(authentication));
        return "edit_profile";
    }

    @GetMapping("/contacts")
    public String openContactsPage() {
        return "contacts";
    }

    @GetMapping("/teams")
    public String openTeamsPage(@ModelAttribute("model")ModelMap model) {
        model.addAttribute("countries", countriesRepository.findAll());
        return "teams";
    }
}
