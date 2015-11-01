package br.com.payfast.payment;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.Singleton;

@Singleton
public class HasMapPaymentsDao implements Payments {

	private Map<Long, Payment> repository = new HashMap<>();
	
	private Long primaryKey;
	
	public HasMapPaymentsDao() {
		repository.put(1L, new PaymentBuilder().withId(1L).withValue(new BigDecimal(100)).withStatus(PaymentStatus.APROVED));
		repository.put(2L, new PaymentBuilder().withId(2L).withValue(new BigDecimal(200)).withStatus(PaymentStatus.APROVED));
		repository.put(3L, new PaymentBuilder().withId(3L).withValue(new BigDecimal(300)).withStatus(PaymentStatus.APROVED));
		repository.put(4L, new PaymentBuilder().withId(4L).withValue(new BigDecimal(400)).withStatus(PaymentStatus.APROVED));
		repository.put(5L, new PaymentBuilder().withId(5L).withValue(new BigDecimal(500)).withStatus(PaymentStatus.APROVED));
		primaryKey = 5L;
	}
	
	@Override
	public Payment getById(Long id) {
		return repository.get(id);
	}

	@Override
	public Payment save(Payment payment) {
		primaryKey++;
		payment.setId(primaryKey);
		repository.put(primaryKey, payment);
		
		return payment;
	}

}
