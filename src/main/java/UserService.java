import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("user")
public class UserService {
    UserRepo userRepo = new UserRepo();

     @POST
     @Path("form")
     public Response createUser(@FormParam("name") String name){
         return Response.status(200)
                 .entity("addUser is called, name : " + name).build();
     }

     @POST
    @Path("queryparam")
    public Response createUserQuery(@QueryParam("name") String name){
         return Response.status(200)
                 .entity("create user is called, name: " + name).build();
     }

/*     @GET
    @Path("pathparam/{id}")
    public Response getUser(@PathParam("id") String id ){
        return Response.status(200)
                .entity("called user: " + userRepo.getUser(id).getName())
                .build();
     } */

    @GET
    @Path("pathparam/{id}")
    public String getUser(@PathParam("id") String id ){
        return "New called user: " + userRepo.getUser(id).getName();
    }
}
