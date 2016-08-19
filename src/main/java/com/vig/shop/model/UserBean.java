package com.vig.shop.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "register")
public class UserBean implements Serializable {
	private static final long serialVersionUID = 4657462015039726030L;
	@Id
	private String userId;
	private String email;
	private Integer age;
	private String pass;

	public String getUserId() {
		return userId;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
