package jp.co.central_soft.train2019.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoUtil
{
	public static Connection getConnection()
			throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = null;
		con = DriverManager.getConnection("jdbc:mysql://"
				+ "localhost"
				+ "/"
				+ "squat_schema"
				+ "?characterEncoding="
				+ "UTF-8"
				+ "&serverTimezone="
				+ "JST",
				"root",
				"root"
		);

		return con;
	}
}
