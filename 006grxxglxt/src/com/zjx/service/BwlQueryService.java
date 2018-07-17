package com.zjx.service;

import java.util.ArrayList;
import java.util.List;
import com.zjx.dao.BwlQueryDao;
import com.zjx.entity.Bwl;

/*****************************
*@类名	BwlQueryService.java
*@作者	bingshuang2014
*@日期	2018年7月2日-上午11:55:41
*@版本	v1.0
*@描述	
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
