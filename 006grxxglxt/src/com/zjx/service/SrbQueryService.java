package com.zjx.service;

import java.util.ArrayList;
import java.util.List;

import com.zjx.dao.SrbQueryDao;
import com.zjx.entity.Srb;

/*****************************
*@����	SrbQueryService.java
*@����	bingshuang2014
*@����	2018��7��2��-����2:21:43
*@�汾	v1.0
*@����	
*****************************/
public class SrbQueryService {
	SrbQueryDao sqd = new SrbQueryDao();
	
	public List<Srb> SrbQuery(String uid) {
		List<Srb> list = new ArrayList<Srb>();
		try{
			 list=sqd.SrbQuery(uid);
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			sqd.closeConnection();
		}
		return list;
	}

}
