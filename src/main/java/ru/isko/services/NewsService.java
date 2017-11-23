package ru.isko.services;

import ru.isko.forms.NewsForm;
import ru.isko.models.News;

/**
 * created by Iskander Valiev
 * on 11/23/17
 *
 * @author Iskander Valiev (Kazan Federal University Higher School of Information Technologies and Information Systems)
 * @version 1.0
 */
public interface NewsService {

    void addNews(NewsForm newsForm);

}
