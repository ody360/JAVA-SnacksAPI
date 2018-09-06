package com.galvanize.resources;


import com.galvanize.model.Snack;
import com.galvanize.service.SnackService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/snacks")
public class SnackResource {
    SnackService snackService = new SnackService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Snack> getSnacks() {
        return snackService.getAllSnacks();
    }

    @GET
    @Path("/featured")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Snack> getFeatured() {
        return snackService.getFeatured();

    }

    @GET
    @Path("/{snackId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Snack getSnack(@PathParam("snackId") long id) {
        return snackService.getSnack(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Snack addSnack(Snack snack) {
        return snackService.addSnack((snack));
    }

    @PUT
    @Path("/{snackId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Snack updateSnack(@PathParam("snackId") long id, Snack snack) {
        snack.setId(id);
        return snackService.updateSnack(snack);
    }
}
