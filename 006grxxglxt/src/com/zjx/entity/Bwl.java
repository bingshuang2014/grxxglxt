package com.zjx.entity;

import java.util.Date;

/*****************************
*@����	Bwl.java
*@����	bingshuang2014
*@����	2018��6��30��-����9:48:10
*@�汾	v1.0
*@����	
*****************************/
public class Bwl {
	private Integer bid;
	private Integer uid;
	private Date btime;
	private String place;
	private String thing;
	private Date addtime;
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Date getBtime() {
		return btime;
	}
	public void setBtime(Date btime) {
		this.btime = btime;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getThing() {
		return thing;
	}
	public void setThing(String thing) {
		this.thing = thing;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	
	

}
