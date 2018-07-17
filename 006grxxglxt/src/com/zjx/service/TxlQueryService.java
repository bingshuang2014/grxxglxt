package com.zjx.service;

import java.util.ArrayList;
import java.util.List;

import com.zjx.dao.TxlQueryDao;
import com.zjx.entity.Txl;

/*****************************
*@类名	TxlQueryService.java
*@作者	bingshuang2014
*@日期	2018年7月2日-上午10:18:32
*@版本	v1.0
*@描述	
*****************************/
public class TxlQueryService {
	TxlQueryDao tqd = new TxlQueryDao();
	
	public List<Txl> TxlQuery(String uid) {
		List<Txl> list = new ArrayList<Txl>();
		try{
			 list=tqd.TxlQuery(uid);
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			tqd.closeConnection();
		}
		return list;
	}

}
