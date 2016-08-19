package com.vig.shop.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "USERROLE")
@Component
public class Role {
	@Id
	private String rolid;
	private String role;
	@OneToOne
	@JoinColumn(name = "userId")
	private UserBean ub;

	public UserBean getUb() {
		return ub;
	}

	public void setUb(UserBean ub) {
		this.ub = ub;
	}

	public String getRolid() {
		return rolid;
	}

	public void setRolid(String rolid) {
		this.rolid = rolid;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
