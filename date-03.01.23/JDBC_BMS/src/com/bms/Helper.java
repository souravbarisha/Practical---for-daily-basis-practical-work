package com.bms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Helper {
static {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver"); // registering my sql drive
	}catch(Exception e) {
		System.out.println(e);
	}
}

public static Connection con() throws SQLException {
	return DriverManager.getConnection("jdbc:mysql://localhost:3306/souravdb","root","sourav@1998");
}
}
