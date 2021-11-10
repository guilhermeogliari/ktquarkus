package br.com.ktquarkus.service;

import br.com.ktquarkus.domain.User;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDate;

@ApplicationScoped
public class UserService {

    public User getUser(){
        User user = new User();
        user.setName("Guilherme");
        user.setBirth(LocalDate.now());
        return user;
    }

}
