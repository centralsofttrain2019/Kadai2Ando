package jp.co.central_soft.train2019.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.central_soft.train2019.bean.EmployeeBean;

public class EmployeesDao
{
	private static final String SELECT_SQL =
			"SELECT * " +
			"FROM employees " +
			"WHERE "
			+ "EmployeeID = ? ";

	private static final String SELECT_ALL_SQL =
			"SELECT * " +
			"FROM employees ";

	private Connection con;

	public EmployeesDao(Connection con) {
		this.con = con;
	}

	public EmployeeBean findByKey(int id) throws SQLException
	{
		try(PreparedStatement pstmt = this.con.prepareStatement(SELECT_SQL)) {
			pstmt.setInt(1, id);
			ResultSet r = pstmt.executeQuery();

			if(!r.next())
				throw new RuntimeException("取得に失敗しました");

			EmployeeBean ret = new EmployeeBean();
			ret.setEmployeeID(r.getInt("EmployeeID"));
			ret.setEmployeeName(r.getString("EmployeeName"));
			ret.setHeight(r.getBigDecimal("Height"));
			ret.setWeight(r.getBigDecimal("Weight"));
			ret.setEMail(r.getString("EMail"));
			ret.setHireFiscalYear(r.getInt("HireFiscalYear"));
			ret.setBirthday(r.getDate("Birthday").toLocalDate());
			ret.setBloodType(r.getString("BloodType"));

			return ret;
		}
	}

	public List<EmployeeBean> findAll() throws SQLException
	{
		try(PreparedStatement pstmt = this.con.prepareStatement(SELECT_ALL_SQL)) {
			ResultSet r = pstmt.executeQuery();

			List<EmployeeBean> rets = new ArrayList<>();
			while(r.next()) {
				EmployeeBean ret = new EmployeeBean();
				ret.setEmployeeID(r.getInt("EmployeeID"));
				ret.setEmployeeName(r.getString("EmployeeName"));
				ret.setHeight(r.getBigDecimal("Height"));
				ret.setWeight(r.getBigDecimal("Weight"));
				ret.setEMail(r.getString("EMail"));
				ret.setHireFiscalYear(r.getInt("HireFiscalYear"));
				ret.setBirthday(r.getDate("Birthday").toLocalDate());
				ret.setBloodType(r.getString("BloodType"));
				rets.add(ret);
			}

			return rets;
		}
	}
}

