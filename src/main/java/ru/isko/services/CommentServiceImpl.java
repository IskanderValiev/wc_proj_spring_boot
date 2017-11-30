package ru.isko.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import ru.isko.forms.CommentsForm;
import ru.isko.models.Comment;
import ru.isko.repositories.comments.CommentsRepository;
import ru.isko.repositories.news.NewsRepository;

import java.sql.Timestamp;
import java.util.List;

/**
 * created by Iskander Valiev
 * on 11/23/17
 *
 * @author Iskander Valiev (Kazan Federal University Higher School of Information Technologies and Information Systems)
 * @version 1.0
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentsRepository commentsRepository;

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private NewsRepository newsRepository;

    @Override
    public void addComment(CommentsForm commentsForm, Authentication authentication) {
        Comment comment = Comment.builder()
                .content(commentsForm.getText())
                .date(new Timestamp(System.currentTimeMillis()))
                .author(authenticationService.getUser(authentication))
                .news(newsRepository.findOne(commentsForm.getNewsId()))
                .build();
        commentsRepository.save(comment);
    }

    @Override
    public List<Comment> getAll() {
        return commentsRepository.findAll();
    }

    @Override
    public void deleteComment(Long id) {
        commentsRepository.delete(id);
    }
}
