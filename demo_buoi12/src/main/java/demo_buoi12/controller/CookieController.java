package demo_buoi12.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/democookie")
public class CookieController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Cookie[] cookies = req.getCookies();
		boolean isRedirect = false;
		
		for (Cookie cookie : cookies) {
			String name = cookie.getName();
			if(name.equals("username")) {
				isRedirect = true;
			}
		}
		
		if(isRedirect) {
			resp.sendRedirect(req.getContextPath() + "/welcome");
		}else {
			req.getRequestDispatcher("democookie.jsp")
			.forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String remember = req.getParameter("remember");
		
		if(username.toLowerCase().equals("cybersoft")
				&& password.equals("123")
				) {
			//Đăng nhập thành công
			if(remember != null) {
				//Đã check vào checkbox
				Cookie cookie = new Cookie("username", username);
				cookie.setMaxAge(1800);
				resp.addCookie(cookie);
			}
			
			resp.sendRedirect(req.getContextPath() + "/welcome");
			
		}else {
			//Đăng nhập thất bại
			
		}
		
		
		
		System.out.println("kiemtra " + remember);
	}
	
}
