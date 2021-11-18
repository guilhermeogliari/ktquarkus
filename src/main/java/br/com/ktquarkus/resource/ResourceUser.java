package br.com.ktquarkus.resource;

import br.com.ktquarkus.domain.ResponseFilms;
import br.com.ktquarkus.domain.User;
import br.com.ktquarkus.service.UserService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@RequestScoped
@Path("v1/user")
public class ResourceUser {

    @Inject
    UserService userService;

//    RestFul
//    @POST -- Inserir
//    @PUT - Alterar
//    @HEAD - Alterar
//    @DELETE - Deletar
//    @GET - Buscar

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response persistUser(User user){
        return userService.persistUser(user);
    }

    @GET
    @Path("getAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser(@PathParam("id") String id){
        return userService.getUser(id);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateUser(User user){
        return userService.updateUser(user);
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteUser(@PathParam("id") String id){
        return userService.deleteUser(id);
    }

//    @POST
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response insertUser(User user){
//        return Response.accepted().build();
//    }

    @GET
    @Path("getFilms")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseFilms getFilms(){
        return userService.getFilms();
    }

}
