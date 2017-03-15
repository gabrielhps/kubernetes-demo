package com.kubernetesdemo.rest;

import com.kubernetesdemo.domain.Greeting;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingController {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Greeting sayHelloWorld(@PathParam("id") String name) {
        return new Greeting(name);
    }

}
