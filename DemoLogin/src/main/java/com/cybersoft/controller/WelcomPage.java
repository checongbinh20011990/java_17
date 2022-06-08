package com.cybersoft.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybersoft.pojo.Product;

@WebServlet("/welcome")
public class WelcomPage extends HttpServlet {
	List<Product> list;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub

		super.init();
		list = new ArrayList<>();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/welcome.jsp");
		
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		
		req.setCharacterEncoding("UTF-8");
		
		Product product = new Product();
		product.setName(req.getParameter("tensp"));
		product.setSoluong(req.getParameter("soluong"));
		product.setGia(req.getParameter("gia"));
		
		list.add(product);
		
		req.setAttribute("products", list);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/welcome.jsp");
		
		dispatcher.forward(req, resp);
	}
	
}
