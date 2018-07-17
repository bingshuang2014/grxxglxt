package com.zjx.service;

import java.util.ArrayList;
import java.util.List;
import com.zjx.dao.BwlQueryDao;
import com.zjx.entity.Bwl;

/*****************************
*@����	BwlQueryService.java
*@����	bingshuang2014
*@����	2018��7��2��-����11:55:41
*@�汾	v1.0
*@����	
*****************************/
public class BwlQueryService {
	BwlQueryDao bqd = new BwlQueryDao();
	
	public List<Bwl> BwlQuery(String uid) {
		List<Bwl> list = new ArrayList<Bwl>();
		try{
			 list=bqd.BwlQuery(uid);
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			bqd.closeConnection();
		}
		return list;
	}

}
