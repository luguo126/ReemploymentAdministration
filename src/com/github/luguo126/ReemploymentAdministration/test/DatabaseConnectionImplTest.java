package com.github.luguo126.ReemploymentAdministration.test;

import java.sql.Connection;

import com.github.luguo126.ReemploymentAdministration.dbc.DatabaseConnection;
import com.github.luguo126.ReemploymentAdministration.dbc.impl.DatabaseConnectionImpl;

public class DatabaseConnectionImplTest {

	public static void main(String[] args) {
		DatabaseConnection dbc = new DatabaseConnectionImpl();
		Connection conn = dbc.getConnection();
		
		System.out.println("成功连接到数据库reemployment.\n" + conn.toString());
		
		dbc.closeConnection();
		
	}

}
