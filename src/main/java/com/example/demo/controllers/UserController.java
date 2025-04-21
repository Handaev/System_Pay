package com.example.demo.controllers;


import com.example.demo.entities.Card;
import com.example.demo.repositories.Repositories;
import org.apache.tomcat.websocket.WsWebSocketContainer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class UserController {

    private Repositories repositories;

    public UserController(Repositories repositories){
        this.repositories = repositories;
    }

    @PostMapping
    public void save(){
        repositories.save();
        System.out.println(repositories.findByFirstName("asdfgh").getLastName());
    }

}
