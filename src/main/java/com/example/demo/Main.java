//package com.example.demo;
//
//import com.example.demo.config.HibernateConfig;
//import com.example.demo.entities.Card;
//import com.example.demo.repositories.Repositories;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//public class Main {
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(HibernateConfig.class);
//        Repositories repositories = context.getBean(Repositories.class);
//        repositories.save();
//
//
//        Card card = repositories.findByFirstName("asdfgh");
//        System.out.println(card.getFirstName());
//
//        context.close();
//    }
//}
