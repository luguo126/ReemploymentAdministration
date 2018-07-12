package com.github.luguo126.ReemploymentAdministration.dbc;

import java.sql.Connection ;

public interface DatabaseConnection {
	Connection getConnection();
	void closeConnection();
}
