package com.zjx.service;

import java.util.ArrayList;
import java.util.List;

import com.zjx.dao.RjbQueryDao;
import com.zjx.entity.Rjb;

/*****************************
*@����	RjbQueryService.java
*@����	bingshuang2014
*@����	2018��7��2��-����1:11:43
*@�汾	v1.0
*@����	
*****************************/
public class RjbQueryService {
	RjbQueryDao rqd = new RjbQueryDao();
	
	public List<Rjb> RjbQuery(String uid) {
		List<Rjb> list = new ArrayList<Rjb>();
		try{
			 list=rqd.RjbQuery(uid);
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			rqd.closeConnection();
		}
		return list;
	}

}
