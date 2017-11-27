package ru.isko.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.isko.forms.NewsForm;
import ru.isko.models.News;
import ru.isko.repositories.news.NewsRepository;

/**
 * created by Iskander Valiev
 * on 11/23/17
 *
 * @author Iskander Valiev (Kazan Federal University Higher School of Information Technologies and Information Systems)
 * @version 1.0
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsRepository newsRepository;

    @Override
    public void addNews(NewsForm newsForm) {
        News news = News.builder()
                .header(newsForm.getHeader())
                .content(newsForm.getContent())
                .date(new java.sql.Date(System.currentTimeMillis()))
                .image(newsForm.getImage())
                .type(newsForm.getType())
                .build();
        newsRepository.save(news);
    }
}
