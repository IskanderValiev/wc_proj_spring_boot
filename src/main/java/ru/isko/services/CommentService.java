package ru.isko.services;

import ru.isko.forms.CommentsForm;
import ru.isko.models.Comment;

import java.util.List;

public interface CommentService {

    void addComment(CommentsForm commentsForm);
    List<Comment> getAll();
}
