package ru.isko.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * created by Iskander Valiev
 * on 11/30/17
 *
 * @author Iskander Valiev (Kazan Federal University Higher School of Information Technologies and Information Systems)
 * @version 1.0
 */
@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Response {
    private String status;
    private Object data;
}
