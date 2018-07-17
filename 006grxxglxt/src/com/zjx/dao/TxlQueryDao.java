package com.zjx.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zjx.entity.Txl;

/*****************************
*@类名	TxlQueryDao.java
*@作者	bingshuang2014
*@日期	2018年7月2日-上午10:42:37
*@版本	v1.0
*@描述	
*****************************/
public class TxlQueryDao extends BaseDao{
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	
	public List<Txl> TxlQuery(String uid) {
		List<Txl> list = new ArrayList<Txl>();
		try{
			connection = getConnection();
			String sql="select * from txl where uid=?";
			pstmt= connection.prepareStatement(sql);
			pstmt.setString(1, uid);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Txl txl= new Txl();
				txl.setTid(rs.getInt("tid"));
				txl.setUid(rs.getInt("uid"));
				txl.setTname(rs.getString("tname"));
				txl.setTel(rs.getString("tel"));
				txl.setRelation(rs.getString("relation"));
				txl.setPlace(rs.getString("place"));
				txl.setJob(rs.getString("job"));
				txl.setQq(rs.getString("qq"));
				list.add(txl);
				
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
