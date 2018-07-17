package com.zjx.service;

import java.util.ArrayList;
import java.util.List;

import com.zjx.dao.TxlQueryDao;
import com.zjx.entity.Txl;

/*****************************
*@����	TxlQueryService.java
*@����	bingshuang2014
*@����	2018��7��2��-����10:18:32
*@�汾	v1.0
*@����	
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
