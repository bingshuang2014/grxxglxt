package com.zjx.service;

import com.zjx.dao.YhbQueryDao;
import com.zjx.entity.Yhb;

/*****************************
*@����	YhbQueryService.java
*@����	bingshuang2014
*@����	2018��7��1��-����9:45:51
*@�汾	v1.0
*@����	
*****************************/
public class YhbQueryService {
	YhbQueryDao yqd = new YhbQueryDao();
	
	public Yhb YhbQuery(String uid) {
		Yhb yhb = null;
		try{
			yhb =yqd.YhbQuery(uid);
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			yqd.closeConnection();
		}
		return yhb;
	}
	
}
