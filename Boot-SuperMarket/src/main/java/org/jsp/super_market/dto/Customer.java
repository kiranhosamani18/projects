package org.jsp.super_market.dto;

import java.util.List;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
@Component
public class Customer {
	@Id
	@GeneratedValue(generator = "customerid")
	@GenericGenerator(name = "customerid", strategy = "org.jsp.super_market.helper.CustomerIdGenerator")
	String id;
	String name;
	String email;
	String password;
	long mobile;
	String address;
	boolean status;
	double wallet;
	int otp;

	@OneToOne(cascade = CascadeType.ALL)
	Cart cart;

	@OneToMany(cascade = CascadeType.ALL)
	List<ShoppingOrder> orders;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getWallet() {
		return wallet;
	}

	public void setWallet(double wallet) {
		this.wallet = wallet;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public List<ShoppingOrder> getOrders() {
		return orders;
	}

	public void setOrders(List<ShoppingOrder> orders) {
		this.orders = orders;
	}
	
	

}