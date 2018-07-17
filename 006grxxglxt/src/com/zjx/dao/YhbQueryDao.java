package com.zjx.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.zjx.entity.Yhb;

/*****************************
*@����	YhbQueryDao.java
*@����	bingshuang2014
*@����	2018��7��1��-����10:06:48
*@�汾	v1.0
*@����	
*****************************/
public class YhbQueryDao extends BaseDao{
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;

	public Yhb YhbQuery(String uid) {
		Yhb yhb=null;
		try{
			connection = getConnection();
			String sql="select * from yhb where uid=?";
			pstmt= connection.prepareStatement(sql);
			pstmt.setString(1, uid);
			rs = pstmt.executeQuery();
			while(rs.next()){
				yhb= new Yhb();
				yhb.setUid(rs.getInt("uid"));
				yhb.setUage(rs.getString("uage"));
				yhb.setUbirthday(rs.getDate("ubirthday"));
				yhb.setUtel(rs.getString("utel"));
				yhb.setUqq(rs.getString("uqq"));
				yhb.setUjob(rs.getString("ujob"));
				yhb.setUplace(rs.getString("uplace"));
				yhb.setUsex(rs.getString("usex"));				
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
		return yhb;
	}
}
