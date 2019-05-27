
package jp.co.central_soft.train2019.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.central_soft.train2019.bean.ShowEmployeesAllBean;
import jp.co.central_soft.train2019.service.EmployeesService;

/**
 * Servlet implementation class ShowEmployeeAllServlet
 * @author koki.ando
 */
@WebServlet("/show-employees-all")
public class ShowEmployeesAllServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowEmployeesAllServlet()
    {
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
    {
    	System.out.println("ShowEmployeeAllServletが実行されました。");

    	EmployeesService service = new EmployeesService();
    	ShowEmployeesAllBean ret = service.findAll();
        request.setAttribute("bean", ret);

    	String view = "/WEB-INF/jsp/show_employees_all.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(view);

        dispatcher.forward(request, response);
    }
}

