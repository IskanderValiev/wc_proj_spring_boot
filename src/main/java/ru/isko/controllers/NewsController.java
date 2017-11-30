package ru.isko.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.isko.forms.NewsForm;
import ru.isko.models.News;
import ru.isko.repositories.comments.CommentsRepository;
import ru.isko.repositories.news.NewsRepository;
import ru.isko.security.role.Role;
import ru.isko.services.AuthenticationService;
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
    private AuthenticationService authenticationService;

    @Autowired
    private NewsRepository newsRepository;

    @Autowired
    private NewsService newsService;

    @Autowired
    private CommentsRepository commentsRepository;


    @GetMapping("/news")
    public String news(@ModelAttribute("model")ModelMap model, Authentication authentication) {
        if (authenticationService.getUser(authentication).getRole().equals(Role.USER)) {
            return "redirect:/user/news";
        } else if (authenticationService.getUser(authentication).getRole().equals(Role.ADMIN)) {
            return "redirect:/admin/news";
        }
        return "redirect:/signin";
    }

    @GetMapping("/admin/addnews")
    public String addnews() {
        return "admin/addnews";
    }

    @PostMapping("/admin/postnews")
    public String postNews(@ModelAttribute("newsForm") NewsForm newsForm) {
        newsService.addNews(newsForm);
        return "redirect:/admin/news";
    }

    @GetMapping("/user/news/{news-id}")
    public String openNewsPage(@ModelAttribute("model") ModelMap model, @PathVariable("news-id") Long newsId) {
        News news = newsRepository.findOne(newsId);
        model.addAttribute("news", newsRepository.findOne(newsId));
        model.addAttribute("comments", commentsRepository.findAllByNews(news));
        return "selected_news";
    }

    @GetMapping("/admin/news/{news-id}")
    public String openNewsPageAdmin(@ModelAttribute("model") ModelMap model, @PathVariable("news-id") Long newsId) {
        News news = newsRepository.findOne(newsId);
        model.addAttribute("news", newsRepository.findOne(newsId));
        model.addAttribute("comments", commentsRepository.findAllByNews(news));
        return "admin/selected_news";
    }

    @GetMapping("/admin/delete/{comment-id}")
    public String deleteComment(@PathVariable("comment-id")Long id) {
        commentsRepository.delete(id);
        return "redirect:/news";
    }
}
