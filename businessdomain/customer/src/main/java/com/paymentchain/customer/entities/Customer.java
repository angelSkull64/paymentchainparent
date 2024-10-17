package com.paymentchain.customer.entities;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;


/**
 *
 * @author luis
 */
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String code;
	private String name;
	private String phone;
	private String iban;
	private String surname;
	private String address;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CustomerProduct> products;
	@Transient
	private List<?> transactions;

	public Customer() {
	}

	public Customer(long id, String code, String name, String phone, String iban, String surname, String address,
			List<CustomerProduct> products, List<?> transactions) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.phone = phone;
		this.iban = iban;
		this.surname = surname;
		this.address = address;
		this.products = products;
		this.transactions = transactions;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<CustomerProduct> getProducts() {
		return products;
	}

	public void setProducts(List<CustomerProduct> products) {
		this.products = products;
	}

	public List<?> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<?> transactions) {
		this.transactions = transactions;
	}

}
