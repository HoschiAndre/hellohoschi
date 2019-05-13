package de.hoschiland.hellohoschi;

import de.hoschiland.hellohoschi.de.hoschiland.hellohoschi.util.Hoschi;
import de.hoschiland.hellohoschi.de.hoschiland.hellohoschi.util.HoschiStore;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("hellohoschi")
public class HelloHoschiEndpoint {

    @GET
    @Path("text")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getHoschiText() {

        return Response.ok("Hello from Hoschi!").build();
    }


    @GET
    @Path("hoschi/{nickName}")
    //@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHoschi(@PathParam("nickName") String nickName) {

        System.out.println("nickName: " + nickName);
        Hoschi hoschi = HoschiStore.getInstance().getHoschi(nickName);

        return Response.ok().entity(hoschi).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("all")
    public Response getAllHoschis() {

        System.out.println("Test1");
        System.out.println(HoschiStore.getInstance().getAllHoschis());


        return Response.ok().entity(HoschiStore.getInstance().getAllHoschis()).build();
    }

    @POST
    @Path("add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addHoschi(Hoschi hoschi) {

        HoschiStore.getInstance().addHoschi(hoschi);

        return Response.ok().build();
    }

}
