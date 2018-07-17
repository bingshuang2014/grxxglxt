package com.zjx.service;

import java.util.ArrayList;
import java.util.List;

import com.zjx.dao.ZcbQueryDao;
import com.zjx.entity.Zcb;

/*****************************
*@����	ZcbQueryService.java
*@����	bingshuang2014
*@����	2018��7��2��-����2:22:47
*@�汾	v1.0
*@����	
*****************************/
public class ZcbQueryService {
	ZcbQueryDao zqd = new ZcbQueryDao();

	public List<Zcb> ZcbQuery(String uid) {
		List<Zcb> list = new ArrayList<Zcb>();
		try{
			 list=zqd.ZcbQuery(uid);
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			zqd.closeConnection();
		}
		return list;
	}

}
