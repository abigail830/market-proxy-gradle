package com.saraqian;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("health")
public class Health {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "I am Health!";
    }
}

