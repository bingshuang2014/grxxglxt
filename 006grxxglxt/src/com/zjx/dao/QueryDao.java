package com.zjx.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zjx.entity.Mmb;

/*****************************
*@����	QueryDao.java
*@����	bingshuang2014
*@����	2018��6��29��-����12:43:11
*@�汾	v1.0
*@����	
*****************************/
public class QueryDao extends BaseDao{
private PreparedStatement pstmt=null;
private ResultSet rs=null;

public Mmb login(String uname, String upwd) {
	Mmb mmb=null;
	try{
		connection = getConnection();
		String sql="select uid,uname,upwd from mmb where uname=? and upwd=?";
		pstmt= connection.prepareStatement(sql);
		pstmt.setString(1, uname);
		pstmt.setString(2, upwd);
		rs = pstmt.executeQuery();
		while(rs.next()){
			mmb= new Mmb();
			mmb.setUid(rs.getInt("uid"));
			mmb.setUname(rs.getString("uname"));
			mmb.setUpwd(rs.getString("upwd"));
		}
	}catch (Exception e) {
		e.printStackTrace();
	}finally{
		try {
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
	return mmb;
}






}
