package roson.rok.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hallo")
public class Hallo {

    @GET
    public String hallo() {
        return "Hallo";
    }
}