package com.zjx.service;

import com.zjx.dao.QueryDao;
import com.zjx.entity.Mmb;


/*****************************
*@����	QueryService.java
*@����	bingshuang2014
*@����	2018��6��29��-����1:22:46
*@�汾	v1.0
*@����	
*****************************/
public class QueryService {
	QueryDao qd= new QueryDao();
	
	public Mmb login(String uname, String upwd) {
		Mmb mmb=null;
		try{
			mmb =qd.login(uname,upwd);
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			qd.closeConnection();
		}
		return mmb;
	}



}
