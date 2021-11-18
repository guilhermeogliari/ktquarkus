package br.com.ktquarkus.service;

import br.com.ktquarkus.client.FilmsClient;
import br.com.ktquarkus.domain.ResponseFilms;
import br.com.ktquarkus.domain.User;
import br.com.ktquarkus.repository.UserRepository;
import org.bson.types.ObjectId;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
public class UserService {

    @Inject
    @RestClient
    FilmsClient filmsClient;

    @Inject
    UserRepository userRepository;

    public List<User> getAllUser() {
        return userRepository.findAll().list();
    }

    public User getUser(String id){
        return userRepository.findById(new ObjectId(id));
    }

    public Response persistUser(User user){
        userRepository.persist(user);
        return Response.accepted().build();
    }

    public Response updateUser(User user){
        userRepository.update(user);
        return Response.ok().build();
    }

    public Response deleteUser(String id){
        userRepository.deleteById(new ObjectId(id));
        return Response.ok().build();
    }

    public ResponseFilms getFilms() {
        return filmsClient.getFilms();
    }

}
