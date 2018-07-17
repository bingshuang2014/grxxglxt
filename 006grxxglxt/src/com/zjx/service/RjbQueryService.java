package com.zjx.service;

import java.util.ArrayList;
import java.util.List;

import com.zjx.dao.RjbQueryDao;
import com.zjx.entity.Rjb;

/*****************************
*@类名	RjbQueryService.java
*@作者	bingshuang2014
*@日期	2018年7月2日-下午1:11:43
*@版本	v1.0
*@描述	
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
