package com.zjx.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*****************************
*@����	BaseDao.java
*@����	bingshuang2014
*@����	2018��6��29��-����12:38:58
*@�汾	v1.0
*@����	
*****************************/
public class BaseDao {
	protected Connection connection;
	/**
	 * ��ȡ����
	 * @return connection
	 */ 
	public Connection getConnection(){
		try{
			if(connection==null){
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/***","root" ,""); 

			}
		}catch (Exception e) {
			System.out.println("����");
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
	 * �ύ����
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
