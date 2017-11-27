package ru.isko.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.isko.repositories.news.NewsRepository;

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

    @GetMapping("/homepage")
    public String openHomepage() {
        return "homepage";
    }

    @GetMapping("/news")
    public String openNews(@ModelAttribute("model")ModelMap model) {
        model.addAttribute("news", newsRepository.findByType("News"));
        model.addAttribute("articles", newsRepository.findByType("Article"));
        model.addAttribute("blogs", newsRepository.findByType("Blog"));
        return "news";
    }
}
