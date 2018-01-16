package Services;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Bean.Aadhar;
import DAO.AadharCardOperations;
import DAO.Operations;


@Path("/aadhar")

public class AadharOperations implements Operations<Aadhar>  {
	
	AadharCardOperations ac = new AadharCardOperations();
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Aadhar> getAll() {
		return ac.getAll();
		
	}
	
	@POST
	@Path("/new")
    @Produces(MediaType.APPLICATION_JSON)
	public boolean add(Aadhar t) {
		return ac.add(t);
	}

	 @GET
	    @Path("/{id}")
	    @Produces(MediaType.APPLICATION_JSON)
	public Aadhar get(@PathParam("id") int primaryKey) {
		 return ac.get(primaryKey);
	}

	 @PUT
		@Path("/edit")
	    @Produces(MediaType.APPLICATION_JSON)
	public Aadhar update(Aadhar t) {
		return ac.update(t);
	}

	@DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public boolean delete(@PathParam("id")int primaryKey) {
		return ac.delete(primaryKey);
	}

	
}
