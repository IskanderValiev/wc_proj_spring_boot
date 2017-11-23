package ru.isko.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.isko.forms.NewsForm;
import ru.isko.repositories.news.NewsRepository;
import ru.isko.services.NewsService;

/**
 * created by Iskander Valiev
 * on 11/23/17
 *
 * @author Iskander Valiev (Kazan Federal University Higher School of Information Technologies and Information Systems)
 * @version 1.0
 */
@Controller
public class NewsController {

    @Autowired
    private NewsRepository newsRepository;

    @Autowired
    private NewsService newsService;


    @GetMapping("/user/news")
    public String news(@ModelAttribute("model")ModelMap model) {
        model.addAttribute("news", newsRepository.findByType("News"));
        model.addAttribute("articles", newsRepository.findByType("Article"));
        model.addAttribute("blogs", newsRepository.findByType("Blog"));
        return "news";
    }

    @GetMapping("/admin/addnews")
    public String addnews() {
        return "addnews";
    }

    @PostMapping("/admin/postnews")
    public String postNews(@ModelAttribute("newsForm") NewsForm newsForm) {
        newsService.addNews(newsForm);
        return "addnews";
    }

    @GetMapping("/user/news/{news-id}")
    public String openNewsPage(@ModelAttribute("model") ModelMap model, @PathVariable("news-id") Long newsId) {
        model.addAttribute("news", newsRepository.findOne(newsId));
        return "selected_news";
    }
}
