package br.com.payfast.payment;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Payment {

	private Long id;
	
	private BigDecimal value;
	
	private PaymentStatus status;
	
	private Calendar date = Calendar.getInstance();

	public Long getId() {
		return id;
	}

	public BigDecimal getValue() {
		return value;
	}

	public PaymentStatus getStatus() {
		return status;
	}

	public Calendar getDate() {
		return date;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public void setStatus(PaymentStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", value=" + value + ", status=" + status + "]";
	}
	
}
