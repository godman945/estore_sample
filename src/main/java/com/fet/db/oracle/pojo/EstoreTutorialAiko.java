package com.fet.db.oracle.pojo;
// Generated 2021/2/18 �U�� 05:57:31 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * EstoreTutorialAiko generated by hbm2java
 */
@Entity
@Table(name = "ESTORE_TUTORIAL_AIKO", schema = "ES_DEV")
public class EstoreTutorialAiko implements java.io.Serializable {

	private String id;
	private String userName;
	private Long userRemain;
	private String userAddr;
	private Date createTime;
	private Date updateTime;

	public EstoreTutorialAiko() {
	}

	public EstoreTutorialAiko(String id, String userName) {
		this.id = id;
		this.userName = userName;
	}

	public EstoreTutorialAiko(String id, String userName, Long userRemain, String userAddr, Date createTime,
			Date updateTime) {
		this.id = id;
		this.userName = userName;
		this.userRemain = userRemain;
		this.userAddr = userAddr;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false, length = 36)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "USER_NAME", nullable = false, length = 20)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "USER_REMAIN", precision = 10, scale = 0)
	public Long getUserRemain() {
		return this.userRemain;
	}

	public void setUserRemain(Long userRemain) {
		this.userRemain = userRemain;
	}

	@Column(name = "USER_ADDR", length = 20)
	public String getUserAddr() {
		return this.userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATE_TIME", length = 7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATE_TIME", length = 7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
