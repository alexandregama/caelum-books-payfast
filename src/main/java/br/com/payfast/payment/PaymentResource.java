package br.com.payfast.payment;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/payment")
public class PaymentResource {

	@GET
	@Path("/{id}")
	public String getPaymentById() {
		return "Its working!";
	}
	
}
