package ru.isko.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.isko.models.News;
import ru.isko.repositories.news.NewsRepository;
import ru.isko.services.NewsService;

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

    @GetMapping("/homepage")
    public String openHomepage() {
        return "homepage";
    }

    @GetMapping("/news")
    public String openNews(@ModelAttribute("model")ModelMap model) {
        model.addAttribute("news", newsService.sortNews(newsRepository.findByType("News")));
        model.addAttribute("articles", newsService.sortNews(newsRepository.findByType("Article")));
        model.addAttribute("blogs", newsService.sortNews(newsRepository.findByType("Blog")));
        return "news";
    }

    @GetMapping("/contacts")
    public String openContacts() {
        return "contacts";
    }
}
