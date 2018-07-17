package com.zjx.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.zjx.entity.Mmb;
import com.zjx.service.QueryService;


@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String uname = new String(request.getParameter("uname").toString().getBytes("ISO-8859-1"), "utf-8");
		String upwd = request.getParameter("upwd");
		
		QueryService qs = new QueryService();
		Mmb mmb = qs.login(uname,upwd);
		if(mmb==null){
			request.setAttribute("error","用户名或密码错误");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else{
			HttpSession session = request.getSession();
			session.setAttribute("uname", mmb.getUname());
			session.setAttribute("uid", mmb.getUid());
			request.getRequestDispatcher("main.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
