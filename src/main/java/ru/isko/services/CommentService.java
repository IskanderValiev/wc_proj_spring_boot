package ru.isko.services;

import org.springframework.security.core.Authentication;
import ru.isko.forms.CommentsForm;
import ru.isko.models.Comment;

import java.util.List;

public interface CommentService {

    void addComment(CommentsForm commentsForm, Authentication authentication);
    List<Comment> getAll();
}
