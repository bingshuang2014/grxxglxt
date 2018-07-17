package com.zjx.service;

import com.zjx.dao.YhbQueryDao;
import com.zjx.entity.Yhb;

/*****************************
*@类名	YhbQueryService.java
*@作者	bingshuang2014
*@日期	2018年7月1日-下午9:45:51
*@版本	v1.0
*@描述	
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
