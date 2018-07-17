package com.zjx.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zjx.entity.Srb;

/*****************************
*@����	SrbQueryDao.java
*@����	bingshuang2014
*@����	2018��7��2��-����2:26:06
*@�汾	v1.0
*@����	
*****************************/
public class SrbQueryDao extends BaseDao{
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	
	public List<Srb> SrbQuery(String uid) {
		List<Srb> list = new ArrayList<Srb>();
		try{
			connection = getConnection();
			String sql="select * from srb where uid=?";
			pstmt= connection.prepareStatement(sql);
			pstmt.setString(1, uid);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Srb srb= new Srb();
				srb.setSid(rs.getInt("sid"));
				srb.setUid(rs.getInt("uid"));
				srb.setProject(rs.getString("project"));
				srb.setImoney(rs.getInt("imoney"));
				srb.setAddtime(rs.getDate("addtime"));
				srb.setIncome(rs.getInt("income"));
				
				list.add(srb);
				
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
