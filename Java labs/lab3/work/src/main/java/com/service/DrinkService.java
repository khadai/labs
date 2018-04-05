package com.service;

import com.iot.model.Drink;
import manager.MenuManager;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/drinks")
public class DrinkService {

    public static MenuManager menuManager = new MenuManager();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)       //формат даних яких метод віддає
    public final Drink getDrink(@PathParam("id") Integer id) {
        return menuManager.getDrinks().get(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)       //формат даних яких метод приймає
    public final Response createDrink(Drink drink) {
        menuManager.addDrink(drink);
        return Response.status(200).entity("Good").build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response deleteDrink(@PathParam("id") Integer id) {
        menuManager.getDrinks().remove(id);
        return Response.status(200).entity("Good").build();
    }

    //метод який оновлює запис
    @POST
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response updateDrink(@PathParam("id") Integer id, Drink drink) {
        menuManager.getDrinks().put(drink.getId(), drink);
        return Response.status(200).entity("Good").build();
    }

}
//РЕСТ спрощує передачу даних між різними абонентів