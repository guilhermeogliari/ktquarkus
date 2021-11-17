package br.com.ktquarkus.client;

import br.com.ktquarkus.domain.ResponseFilms;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RegisterRestClient(configKey = "films-client")
public interface FilmsClient {

    @GET
    @Path("/api/films")
    @Produces(MediaType.APPLICATION_JSON)
    ResponseFilms getFilms();

}
