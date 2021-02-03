package com.fet.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ADM_ROLE database table.
 * 
 */
@Entity
@Table(name="ADM_ROLE")
@NamedQuery(name="AdmRole.findAll", query="SELECT a FROM AdmRole a")
public class AdmRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Temporal(TemporalType.DATE)
	private Date column3;

	@Column(name="ROLE_ID")
	private String roleId;

	@Column(name="ROLE_NAME")
	private String roleName;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	public AdmRole() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getColumn3() {
		return this.column3;
	}

	public void setColumn3(Date column3) {
		this.column3 = column3;
	}

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}