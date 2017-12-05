//package ru.isko.repositories.news;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import ru.isko.models.News;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//import java.util.List;
//
///**
// * created by Iskander Valiev
// * on 11/30/17
// *
// * @author Iskander Valiev (Kazan Federal University Higher School of Information Technologies and Information Systems)
// * @version 1.0
// */
//@Repository
//public class CustomNewsRepositoryImpl implements CustomNewsRepository {
//
//    @Autowired
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public List<News> getLastNews() {
//        Query query = entityManager.createQuery("SELECT news FROM News news ORDER BY news.date DESC LIMIT 5");
//        return query.getResultList();
//    }
//}
