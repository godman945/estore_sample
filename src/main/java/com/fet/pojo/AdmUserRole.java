package com.fet.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ADM_USER_ROLE database table.
 * 
 */
@Entity
@Table(name="ADM_USER_ROLE")
@NamedQuery(name="AdmUserRole.findAll", query="SELECT a FROM AdmUserRole a")
public class AdmUserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="ROLE_ID")
	private String roleId;

	@Column(name="USER_ID")
	private String userId;

	public AdmUserRole() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}