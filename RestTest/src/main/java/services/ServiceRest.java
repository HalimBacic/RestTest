package services;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/drzava")
public class ServiceRest {

	DrzavaService drzavaService = new DrzavaService();
	
	public ServiceRest()
	{}
	
	
	@GET
	public ArrayList<Drzava> getAll()
	{
		return drzavaService.getAll();
	}
	
	@GET
	@Path("/drzava/{id}")
	public Drzava geDrzava(@PathParam("id") int id)
	{
		return drzavaService.getById(id);
	}
}
