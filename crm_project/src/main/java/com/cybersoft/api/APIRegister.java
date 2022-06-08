package com.cybersoft.api;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybersoft.model.UserModel;
import com.cybersoft.payload.ResponseData;
import com.cybersoft.pojo.User;
import com.google.gson.Gson;

@WebServlet("/api/register")
public class APIRegister extends HttpServlet {
	
	UserModel userModel = new UserModel();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		
		User user = new User();
		user.setFullname(req.getParameter("userName"));
		user.setEmail(req.getParameter("email"));
		user.setPassword(req.getParameter("password"));
		user.setRole_id(1);
		
		boolean isSuccess = userModel.insertUser(user);
		
		ResponseData data = new ResponseData();
		data.setSuccess(isSuccess);
		data.setMessage(isSuccess ? "Thành công" : "Thất bại");
		
		Gson gson = new Gson();
		String json = gson.toJson(data);
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.write(json);
		printWriter.flush();
		printWriter.close();
	}
	
}
