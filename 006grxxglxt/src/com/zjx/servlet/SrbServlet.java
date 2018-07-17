package com.zjx.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zjx.entity.Srb;
import com.zjx.service.SrbQueryService;

/**
 * Servlet implementation class SrbServlet
 */
@WebServlet("/SrbServlet")
public class SrbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String uid = request.getParameter("uid");
		
		SrbQueryService sqs = new SrbQueryService();
		List<Srb> list = sqs.SrbQuery(uid);
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("srb.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
