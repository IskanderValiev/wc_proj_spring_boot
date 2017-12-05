package ru.isko.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.isko.forms.CommentsForm;
import ru.isko.models.Comment;
import ru.isko.models.News;
import ru.isko.repositories.comments.CommentsRepository;
import ru.isko.repositories.news.NewsRepository;
import ru.isko.services.CommentService;
import ru.isko.utils.AjaxResponseBody;
import ru.isko.utils.Response;

import java.util.List;

/**
 * created by Iskander Valiev
 * on 12/2/17
 *
 * @author Iskander Valiev (Kazan Federal University Higher School of Information Technologies and Information Systems)
 * @version 1.0
 */

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private CommentsRepository commentsRepository;

    @Autowired
    private NewsRepository newsRepository;

//    @GetMapping("/user/news/{news-id}")
//    public Response getAllCommentsByNews(@PathVariable("news-id")Long newsID) {
//        News news = newsRepository.findOne(newsID);
//        return new Response("Done", commentsRepository.findAllByNews(news));
//    }

    @PostMapping("/user/news/{news-id}")
    public ResponseEntity<?> postComment(@RequestBody CommentsForm commentsForm, @PathVariable("news-id")Long newsId, Authentication authentication, Errors errors) {
        AjaxResponseBody responseBody = new AjaxResponseBody();
        if (errors.hasErrors()) {
            return ResponseEntity.badRequest().body(responseBody);
        }

        Comment comment = commentService.addComment(commentsForm, authentication);
        responseBody.setComments(comment);
        responseBody.setMessage("success");
        return ResponseEntity.ok(responseBody);
    }
}
