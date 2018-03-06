package main.java.API;

import main.java.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("user")
public class UserService {
    static List<User> users = new ArrayList<>();
    static User user1 = new User(1,"Bent", "Bentsen", "bent69","123");
    static User user2 = new User(2, "Bo", "Poulsen", "Bo523", "123");
    static User user3 = new User(3, "Caroline", "Andersen", "vandmand", "123");

    static {
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers() {
        return Response.ok().entity(users).build();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser(@PathParam("id") int id) {
        if (id == 1)
            return Response.ok().entity(user1.toString()).build();
        if (id == 2)
            return Response.ok().entity(user2.toString()).build();
        if (id == 3)
            return Response.ok().entity(user3.toString()).build();
        return Response.noContent().entity("No user with found with that id").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addUser(User user) {
        return Response.serverError().entity("not implemented").build();
        /*if (user != null) {
            users.add(user);
            return Response.ok().build();
        }
        return Response.notModified().build();*/
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateUser(User user) {
        return Response.serverError().entity("not implemented").build();
    }

    @DELETE
    @Path("{id}")
    public Response removeUser(@PathParam("id") int id) {
        for (User user : users) {
            if (id == user.getId()) {
                users.remove(user);
                return Response.ok().build();
            }
        }
        return Response.notModified().entity("Could not find user").build();
    }

}
