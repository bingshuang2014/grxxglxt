package com.zjx.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zjx.entity.Txl;
import com.zjx.service.TxlQueryService;

@WebServlet("/TxlServlet")
public class TxlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String uid = request.getParameter("uid");
		
		TxlQueryService tqs = new TxlQueryService();
		List<Txl> list = tqs.TxlQuery(uid);
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("txl.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
