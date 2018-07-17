package com.zjx.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.zjx.entity.Bwl;

/*****************************
*@类名	BwlQueryDao.java
*@作者	bingshuang2014
*@日期	2018年7月2日-上午11:59:43
*@版本	v1.0
*@描述	
*****************************/
public class BwlQueryDao extends BaseDao{
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	
	public List<Bwl> BwlQuery(String uid) {
		List<Bwl> list = new ArrayList<Bwl>();
		try{
			connection = getConnection();
			String sql="select * from bwl where uid=?";
			pstmt= connection.prepareStatement(sql);
			pstmt.setString(1, uid);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Bwl bwl= new Bwl();
				bwl.setBid(rs.getInt("bid"));
				bwl.setUid(rs.getInt("uid"));
				bwl.setBtime(rs.getDate("btime"));
				bwl.setPlace(rs.getString("place"));
				bwl.setThing(rs.getString("thing"));
				bwl.setAddtime(rs.getDate("addtime"));
				list.add(bwl);
						
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
		return list;
	}
	
}
