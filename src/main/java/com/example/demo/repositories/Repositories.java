package com.example.demo.repositories;

import com.example.demo.entities.Card;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class Repositories {

    private final SessionFactory sessionFactory;

    public Repositories(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(){
        Card card = new Card();
        card.setEmail("jora@gmail.com");
        card.setNumber("2134567");
        card.setPassword("12345678");
        card.setFirstName("asdfgh");
        card.setLastName("sdfghnm");

        Session session = sessionFactory.getCurrentSession();
        session.save(card);
    }

    public Card findByFirstName(String name) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Card.class, name);
    }

}
