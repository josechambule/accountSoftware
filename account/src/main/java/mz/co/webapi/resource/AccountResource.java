package mz.co.webapi.resource;

import java.sql.Date;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import mz.co.webapi.model.Account;
import mz.co.webapi.service.IAccountService;

@Path("account")
public class AccountResource {
	
	@Inject
    private IAccountService accountService;
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public Response getAccountsResource() {
    	List<Account> accounts = accountService.findAll();
        if (!accounts.isEmpty()) {
            return Response.ok(accounts).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
	}
	
    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAccount(@PathParam("id") Long id) {

        Account account = accountService.find(id);       
        if (account.getId() != null) {;
            return Response.ok(account).build();            
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response saveAccount(@FormParam("balance") double balance) {

    	Account account = new Account();
    	long millis = System.currentTimeMillis();  
    	Date date = new Date(millis);
    	account.setBalance(balance);
    	account.setCreationdate(date);

        boolean r = accountService.save(account);

        if (r) {
            return Response.ok().status(Response.Status.CREATED).build();
        } else {
            return Response.notModified().build();
        }        
    }
    
    @Path("/{id}")
    @PUT
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response updateAccount(@FormParam("balance") double balance,
            @PathParam("id") Long id) {

    	Account account = new Account();
    	long millis = System.currentTimeMillis();  
    	Date date = new Date(millis);
    	account.setBalance(balance);
    	account.setCreationdate(date);
    	account.setId(id);

        boolean r = accountService.update(account);
        
        if (r) {
            return Response.ok().status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.notModified().build();
        }           
    }

    @Path("/{id}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAccount(@PathParam("id") Long id) {

    	Account account = accountService.find(id); 
    	boolean r = false;
        if (account.getId() != null) {;
        	r = accountService.delete(account);
        }
        if (r) {
            return Response.ok().status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.notModified().build();
        }
    }
}