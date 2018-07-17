package com.zjx.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.zjx.entity.Yhb;
import com.zjx.service.YhbQueryService;


@WebServlet("/YhbServlet")
public class YhbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String uid = request.getParameter("uid");
		
		YhbQueryService yqs = new YhbQueryService();
		Yhb yhb = yqs.YhbQuery(uid);
		
		request.setAttribute("yhb", yhb);
		request.getRequestDispatcher("grxx.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
