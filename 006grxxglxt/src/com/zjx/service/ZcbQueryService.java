package com.zjx.service;

import java.util.ArrayList;
import java.util.List;

import com.zjx.dao.ZcbQueryDao;
import com.zjx.entity.Zcb;

/*****************************
*@类名	ZcbQueryService.java
*@作者	bingshuang2014
*@日期	2018年7月2日-下午2:22:47
*@版本	v1.0
*@描述	
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
