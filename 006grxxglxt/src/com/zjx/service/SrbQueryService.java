package com.zjx.service;

import java.util.ArrayList;
import java.util.List;

import com.zjx.dao.SrbQueryDao;
import com.zjx.entity.Srb;

/*****************************
*@类名	SrbQueryService.java
*@作者	bingshuang2014
*@日期	2018年7月2日-下午2:21:43
*@版本	v1.0
*@描述	
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
