package com.zjx.entity;

import java.util.Date;

/*****************************
*@����	Srb.java
*@����	bingshuang2014
*@����	2018��6��30��-����9:53:25
*@�汾	v1.0
*@����	
*****************************/
public class Srb {
	private Integer sid;
	private Integer uid;
	private String project;
	private Integer imoney;
	private Date addtime;
	private Integer income;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public Integer getImoney() {
		return imoney;
	}
	public void setImoney(Integer imoney) {
		this.imoney = imoney;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	public Integer getIncome() {
		return income;
	}
	public void setIncome(Integer income) {
		this.income = income;
	}
	
	
}
