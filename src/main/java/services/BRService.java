package services;
import javax.ws.rs.*;

import javax.ws.rs.core.Response;

@Path("/product")
public class BRService {



    @POST

    public Response implementBR(@QueryParam("type")String type) {

        return Response.status(200).build();
    }


    @PUT

    public Response updateBR() {
        return Response.status(200).build();
    }


    @DELETE

    public Response deleteBR() {

        return Response.status(200).build();
    }

}