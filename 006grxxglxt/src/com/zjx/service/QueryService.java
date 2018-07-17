package com.zjx.service;

import com.zjx.dao.QueryDao;
import com.zjx.entity.Mmb;


/*****************************
*@类名	QueryService.java
*@作者	bingshuang2014
*@日期	2018年6月29日-上午1:22:46
*@版本	v1.0
*@描述	
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
