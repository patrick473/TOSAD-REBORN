package services;
import controller.IMPLEMENTINGDELETING;

import javax.ws.rs.*;

import javax.ws.rs.core.Response;

@Path("/product")
public class BRService {

    IMPLEMENTINGDELETING ild = new IMPLEMENTINGDELETING();

    @POST
    @Path("/{type}/{id}")
    public Response implementBR(@PathParam("id") int id,@PathParam("type")String type) {
        ild.create(id,type);
        return Response.status(200).build();
    }


    @PUT
    @Path("/{type}/{id}")
    public Response updateBR(@PathParam("id") int id,@PathParam("type")String type) {
        ild.update(id,type);
        return Response.status(200).build();
    }


    @DELETE
    @Path("/{type}/{id}")
    public Response deleteBR(@PathParam("id") int id,@PathParam("type")String type) {
        ild.delete(id,type);
        return Response.status(200).build();
    }

}