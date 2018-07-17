package com.zjx.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.zjx.entity.Rjb;

/*****************************
*@类名	RjbQueryDao.java
*@作者	bingshuang2014
*@日期	2018年7月2日-下午1:43:49
*@版本	v1.0
*@描述	
*****************************/
public class RjbQueryDao extends BaseDao{
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	
	public List<Rjb> RjbQuery(String uid) {
		List<Rjb> list = new ArrayList<Rjb>();
		try{
			connection = getConnection();
			String sql="select * from rjb where uid=?";
			pstmt= connection.prepareStatement(sql);
			pstmt.setString(1, uid);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Rjb rjb= new Rjb();
				rjb.setRid(rs.getInt("rid"));
				rjb.setUid(rs.getInt("uid"));
				rjb.setTitle(rs.getString("title"));
				rjb.setAddtime(rs.getString("addtime"));				
				rjb.setPlace(rs.getString("place"));
				rjb.setThing(rs.getString("thing"));
				list.add(rjb);
				
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
