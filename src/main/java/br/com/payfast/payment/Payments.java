package br.com.payfast.payment;

public interface Payments {

	Payment getById(Long id);

	Payment save(Payment payment);
	
}
