package metier;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import data.Contact;
import data.DataContacts;

@Path("/lesContacts")
public class ServiceContact{

	@GET @Path("getContact/{refContact}") @Produces(MediaType.APPLICATION_JSON)
	public Contact getContactById(@PathParam("refContact") int idContact) {
		// TODO Auto-generated method stub
		return DataContacts.lstContacts[idContact];
	}

	@GET @Path("getContacts") @Produces({MediaType.APPLICATION_JSON})
	public Contact[] getAllContact() {
		// TODO Auto-generated method stub
		return DataContacts.lstContacts;
	}

	
}
