package com.zjx.entity;

import java.util.Date;

/*****************************
*@����	Zcb.java
*@����	bingshuang2014
*@����	2018��6��30��-����9:57:56
*@�汾	v1.0
*@����	
*****************************/
public class Zcb {
	private Integer zid;
	private Integer uid;
	private String project;
	private Integer imoney;
	private Date addtime;
	private Integer out;
	public Integer getZid() {
		return zid;
	}
	public void setZid(Integer zid) {
		this.zid = zid;
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
	public Integer getOut() {
		return out;
	}
	public void setOut(Integer out) {
		this.out = out;
	}

	
}
