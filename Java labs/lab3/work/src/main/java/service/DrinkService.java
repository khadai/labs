package service;

import com.iot.model.Drink;
import manager.MenuManager;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;

@Path("/drinks")
@SessionScoped
public class DrinkService implements Serializable {

    @Inject
    public MenuManager menuManager;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)       //формат даних яких метод віддає
    public Drink getDrink(@PathParam("id") Integer id) {
        return menuManager.get(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)       //формат даних яких метод приймає
    public Response createDrink(Drink drink) {
        menuManager.put(drink);
        return Response.status(200).entity("Good").build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteDrink(Drink drink) {
        menuManager.remove(drink);
        return Response.status(200).entity("Good").build();
    }

    //метод який оновлює запис
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateDrink(Drink drink) {
        menuManager.update(drink);
        return Response.status(200).entity("Good").build();
    }

}
//РЕСТ спрощує передачу даних між різними абонентів