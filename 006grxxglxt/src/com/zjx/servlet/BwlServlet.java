package com.zjx.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zjx.entity.Bwl;
import com.zjx.service.BwlQueryService;

@WebServlet("/BwlServlet")
public class BwlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String uid = request.getParameter("uid");
		
		BwlQueryService yqs = new BwlQueryService();
		List<Bwl> list = yqs.BwlQuery(uid);
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("bwl.jsp").forward(request, response);	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
