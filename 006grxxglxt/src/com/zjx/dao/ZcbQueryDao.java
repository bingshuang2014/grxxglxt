package com.zjx.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zjx.entity.Zcb;

/*****************************
*@类名	ZcbQueryDao.java
*@作者	bingshuang2014
*@日期	2018年7月2日-下午2:26:14
*@版本	v1.0
*@描述	
*****************************/
public class ZcbQueryDao extends BaseDao{
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	
	public List<Zcb> ZcbQuery(String uid) {
		List<Zcb> list = new ArrayList<Zcb>();
		try{
			connection = getConnection();
			String sql="select * from zcb where uid=?";
			pstmt= connection.prepareStatement(sql);
			pstmt.setString(1, uid);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Zcb zcb= new Zcb();
				zcb.setZid(rs.getInt("zid"));
				zcb.setUid(rs.getInt("uid"));
				zcb.setProject(rs.getString("project"));
				zcb.setImoney(rs.getInt("imoney"));
				zcb.setAddtime(rs.getDate("addtime"));
				zcb.setOut(rs.getInt("out"));
				list.add(zcb);
				
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
