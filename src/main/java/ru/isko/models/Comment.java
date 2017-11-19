//package ru.isko.models;
//
//import lombok.*;
//
//import javax.persistence.*;
//import java.sql.Date;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Setter
//@Getter
//@Builder
//@Entity
//@Table(name = "comment")
//public class Comment {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "author")
//    private User author;
//
//    @Column(name = "date")
//    private Date date;
//
//    @Column(name = "content")
//    private String content;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "news")
//    private News news;
//}
