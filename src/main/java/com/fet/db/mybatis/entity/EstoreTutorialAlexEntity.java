package com.fet.db.mybatis.entity;

import java.util.Date;

public class EstoreTutorialAlexEntity {

	private String id;
	private String userName;
	private Long userRemain;
	private String userAddr;
	private Date createTime;
	private Date updateTime;

	public EstoreTutorialAlexEntity() {
	}

	public EstoreTutorialAlexEntity(String id, Date createTime) {
		this.id = id;
		this.createTime = createTime;
	}

	public EstoreTutorialAlexEntity(String id, String userName, Long userRemain, String userAddr, Date createTime,
			Date updateTime) {
		this.id = id;
		this.userName = userName;
		this.userRemain = userRemain;
		this.userAddr = userAddr;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getUserRemain() {
		return this.userRemain;
	}

	public void setUserRemain(Long userRemain) {
		this.userRemain = userRemain;
	}

	public String getUserAddr() {
		return this.userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
