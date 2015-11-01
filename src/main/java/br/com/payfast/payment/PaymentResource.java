package br.com.payfast.payment;

import java.net.URI;
import java.net.URISyntaxException;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/payments")
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
	
	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_XML)
	public Response createPayment(Payment payment) throws URISyntaxException {
		Payment newPayment = payments.save(payment);
		System.out.println(newPayment);
		
		return Response.created(new URI("payments/" + newPayment.getId())).build();
	}
	
}
