package br.com.payfast.payment;

import java.math.BigDecimal;

public class PaymentBuilder {
	
	public PaymentBuilderWithValue withId(Long id) {
		return new PaymentBuilderWithValue(id);
	}
	
	public class PaymentBuilderWithValue {
		 
		private Long id;

		public PaymentBuilderWithValue(Long id) {
			this.id = id;
		}
		
		public PaymentBuilderWithStatus withValue(BigDecimal value) {
			return new PaymentBuilderWithStatus(id, value);
		}
		
	}
	
	public class PaymentBuilderWithStatus {

		private Long id;
		private BigDecimal value;

		public PaymentBuilderWithStatus(Long id, BigDecimal value) {
			this.id = id;
			this.value = value;
		}
		
		public Payment withStatus(PaymentStatus status) {
			Payment payment = new Payment();
			payment.setId(id);
			payment.setValue(value);
			payment.setStatus(status);
			return payment;
		}
	}
	
}
