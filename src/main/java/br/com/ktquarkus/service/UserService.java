package br.com.ktquarkus.service;

import br.com.ktquarkus.client.FilmsClient;
import br.com.ktquarkus.domain.ResponseFilms;
import br.com.ktquarkus.domain.User;
import br.com.ktquarkus.repository.UserRepository;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import org.bson.types.ObjectId;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class UserService {

    @Inject
    @RestClient
    FilmsClient filmsClient;

    @Inject
    UserRepository userRepository;

    public Multi<User> getAllUser() {
        return userRepository.streamAll();
    }

    public Uni<User> getUser(String id){
        return userRepository.findById(new ObjectId(id))
                .map(this::transformName);
    }

    private User transformName(User user){
        user.setName("REATIVO FUNCIONAL");
        return user;
    }

    public Uni<Response> persistUser(User user){
        return userRepository.persist(user)
                .map(user1 -> Response.ok().build());
    }

    public Uni<Response> updateUser(User user){
        return userRepository.update(user)
                .map(user1 -> Response.ok().build());
    }

    public Uni<Response> deleteUser(String id){
        return userRepository.deleteById(new ObjectId(id))
                .map(aBoolean -> Response.ok().build());
    }

    public Uni<ResponseFilms> getFilms() {
        return filmsClient.getFilms();
    }

}
