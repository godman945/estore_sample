package com.fet.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ADM_MENU database table.
 * 
 */
@Entity
@Table(name="ADM_MENU")
@NamedQuery(name="AdmMenu.findAll", query="SELECT a FROM AdmMenu a")
public class AdmMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String code;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="MENU_NAME")
	private String menuName;

	@Column(name="MENU_PARENT_CODE")
	private String menuParentCode;

	@Column(name="MENU_URL")
	private String menuUrl;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	public AdmMenu() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuParentCode() {
		return this.menuParentCode;
	}

	public void setMenuParentCode(String menuParentCode) {
		this.menuParentCode = menuParentCode;
	}

	public String getMenuUrl() {
		return this.menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}