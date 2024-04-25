package org.jsp.super_market.helper;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Login {
	String id;
	String password;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
