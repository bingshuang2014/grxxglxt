package com.zjx.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*****************************
*@类名	BaseDao.java
*@作者	bingshuang2014
*@日期	2018年6月29日-上午12:38:58
*@版本	v1.0
*@描述	
*****************************/
public class BaseDao {
	protected Connection connection;
	/**
	 * 获取连接
	 * @return connection
	 */ 
	public Connection getConnection(){
		try{
			if(connection==null){
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/***","root" ,""); 

			}
		}catch (Exception e) {
			System.out.println("错误");
		}
		return connection;
	}
	public void closeConnection(){
		try{
			if(connection!=null&&connection.isClosed()){
				connection.close();
				connection=null;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void beginTransaction() throws SQLException{
		connection = this.getConnection();
		connection.setAutoCommit(false);
	}
	/**
	 * 提交事务
	 * @throws SQLException
	 */
	public void commit() throws SQLException{
		if(connection!=null){
			connection.commit();
			
		}
	}
	public void rollback() throws SQLException{
		if(connection!=null){
			connection.rollback();
		}
	}
}
