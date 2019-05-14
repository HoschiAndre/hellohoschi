package de.hoschiland.hellohoschi;

import de.hoschiland.hellohoschi.de.hoschiland.hellohoschi.util.Hoschi;
import de.hoschiland.hellohoschi.de.hoschiland.hellohoschi.util.HoschiStore;
import de.hoschiland.hellohoschi.de.hoschiland.hellohoschi.util.MissingHoschiException;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.Optional;

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
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHoschi(@PathParam("nickName") String nickName) {

        Optional<Hoschi> hoschi = Optional.ofNullable(HoschiStore.getInstance().getHoschi(nickName));

        if (!hoschi.isPresent()) {
            throw new MissingHoschiException(nickName);
        }

        return Response.ok().entity(hoschi.get()).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("all")
    public Response getAllHoschis() {

        return Response.ok().entity(HoschiStore.getInstance().getAllHoschis()).build();
    }

    @POST
    @Path("add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addHoschi(Hoschi hoschi, @Context UriInfo uriInfo) {

        HoschiStore.getInstance().addHoschi(hoschi);

        URI link = uriInfo.getAbsolutePathBuilder().path(hoschi.getNickName()).build(); // ToDo: Not correct path ... is with add in it

        return Response.created(link).build();
    }

    @DELETE
    @Path("delete/{nickName}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteHoschiByNickname(@PathParam("nickName") String nickName) {

        Optional.ofNullable(HoschiStore.getInstance().getHoschi(nickName)).orElseThrow(() -> new MissingHoschiException(nickName));

        HoschiStore.getInstance().deleteHoschiByNickName(nickName);

        return Response.ok().build();
    }

}
