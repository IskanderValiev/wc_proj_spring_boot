package ru.isko.repositories.news;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.isko.models.News;

public interface NewsRepository extends JpaRepository<News, Long> {

//    List<News> getAllNews();
//
//    List<News> getAllArticles();
//
//    List<News> getAllBlogs();
//
//    List<News> getAll();
}
