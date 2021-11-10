package br.com.ktquarkus.resource;

import br.com.ktquarkus.domain.User;
import br.com.ktquarkus.service.UserService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("v1/user")
public class ResourceTest {

    @Inject
    UserService userService;

    @GET
    @Path("getAll")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUsers(){
        return userService.getUser();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insertUser(User user){
        return Response.accepted().build();
    }

}
