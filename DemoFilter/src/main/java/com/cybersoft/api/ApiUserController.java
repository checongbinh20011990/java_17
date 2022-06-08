package com.cybersoft.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybersoft.model.UsersModel;
import com.cybersoft.pojo.Users;
import com.google.gson.Gson;

@WebServlet("/api/users")
public class ApiUserController extends HttpServlet {
	
	UsersModel usersModel = new UsersModel();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Users> listUsers =  usersModel.getListUsers();
	
		Gson gson = new Gson();
		String json = gson.toJson(listUsers);
		
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		
		PrintWriter writer = resp.getWriter();
		writer.write(json);
		writer.flush();
		writer.close();
	}
	
}
