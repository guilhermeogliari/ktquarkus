package br.com.ktquarkus.service;

import br.com.ktquarkus.client.FilmsClient;
import br.com.ktquarkus.domain.ResponseFilms;
import br.com.ktquarkus.domain.User;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.time.LocalDate;

@ApplicationScoped
public class UserService {

    @Inject
    @RestClient
    FilmsClient filmsClient;

    public User getUser() {
        User user = new User();
        user.setName("Guilherme");
        user.setBirth(LocalDate.now());
        return user;
    }


    public ResponseFilms getFilms() {
        return filmsClient.getFilms();
    }

}
