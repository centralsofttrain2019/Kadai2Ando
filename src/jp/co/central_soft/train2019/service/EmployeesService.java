package jp.co.central_soft.train2019.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;

import jp.co.central_soft.train2019.bean.EmployeeBean;
import jp.co.central_soft.train2019.bean.ShowEmployeesAllBean;
import jp.co.central_soft.train2019.dao.DaoUtil;
import jp.co.central_soft.train2019.dao.EmployeesDao;

public class EmployeesService
{

	public ShowEmployeesAllBean findAll() throws ServletException
	{
		ShowEmployeesAllBean ret = new ShowEmployeesAllBean();
		List<EmployeeBean> list = null;

		try(Connection con = DaoUtil.getConnection()) {
			EmployeesDao dao = new EmployeesDao(con);
			list = dao.findAll();
		} catch(SQLException | ClassNotFoundException e) {
			throw new ServletException(e);
		}
		ret.setList(list);

		return ret;
	}
}
