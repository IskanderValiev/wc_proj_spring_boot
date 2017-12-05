package ru.isko.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.isko.models.Comment;


/**
 * created by Iskander Valiev
 * on 12/3/17
 *
 * @author Iskander Valiev (Kazan Federal University Higher School of Information Technologies and Information Systems)
 * @version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AjaxResponseBody {
    private String message;
    private Comment comments;
}
