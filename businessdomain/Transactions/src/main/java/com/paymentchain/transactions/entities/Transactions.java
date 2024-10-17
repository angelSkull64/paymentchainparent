package com.paymentchain.transactions.entities;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author luis
 */
@Entity
public class Transactions {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String reference;
	private String ibanAccount;
	private LocalDateTime date;
	private double amount;
	private double fee;
	private String description;
	private String status;
	private String channel;
	
	public Transactions(){}
	
	public Transactions(long id, String reference, String ibanAccount, LocalDateTime date, double amount, double fee,
			String description, String status, String channel) {
		super();
		this.id = id;
		this.reference = reference;
		this.ibanAccount = ibanAccount;
		this.date = date;
		this.amount = amount;
		this.fee = fee;
		this.description = description;
		this.status = status;
		this.channel = channel;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getIbanAccount() {
		return ibanAccount;
	}

	public void setIbanAccount(String ibanAccount) {
		this.ibanAccount = ibanAccount;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

}
