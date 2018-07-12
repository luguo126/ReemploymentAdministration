package com.github.luguo126.ReemploymentAdministration.dbc.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.github.luguo126.ReemploymentAdministration.dbc.DatabaseConnection;

public class DatabaseConnectionImpl implements DatabaseConnection {
	private static final String DRIVERNAME = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/reemployment?characterEncoding=utf8";
	private static final String USER = "blankPage";
	private static final String PASSWORD = "2s1/2blz.";
	
	private Connection conn = null;
	
	public DatabaseConnectionImpl() {
		try {
			Class.forName(DRIVERNAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // 保证找到MySQL驱动
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}  // 保证获取MySQL连接
	}
	
	@Override
	public Connection getConnection() {
		return conn;
	}

	@Override
	public void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} // 保证关闭MySQL连接
	}

}
