package br.com.payfast.payment;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/payment")
public class PaymentResource {

	@Inject
	private Payments payments;
	
	public PaymentResource(Payments payments) {
		this.payments = payments;
	}
	
	@Deprecated
	public PaymentResource() {
	}
	
	@GET
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Payment getPaymentById(@PathParam("id") Long id) {
		Payment payment = payments.getById(id);
		
		return payment;
	}
	
}
