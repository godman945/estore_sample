package com.fet.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ADM_MENU_ROLE database table.
 * 
 */
@Entity
@Table(name="ADM_MENU_ROLE")
@NamedQuery(name="AdmMenuRole.findAll", query="SELECT a FROM AdmMenuRole a")
public class AdmMenuRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="MENU_ID")
	private String menuId;

	@Column(name="ROLE_ID")
	private String roleId;

	public AdmMenuRole() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMenuId() {
		return this.menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}