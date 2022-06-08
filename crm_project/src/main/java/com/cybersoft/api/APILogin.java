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

@WebServlet("/api/login")
public class APILogin extends HttpServlet {
	
	UserModel userModel = new UserModel();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		User user = userModel.getUsersByEmailAndPassword(email,password);
		ResponseData data = new ResponseData();
		
		if(user != null) {
			data.setSuccess(true);
			data.setMessage("Thành công");
			data.setData(user);
		}else {
			data.setSuccess(false);
			data.setMessage("Thất bại");
		}
		
		Gson gson = new Gson();
		String json = gson.toJson(data);
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.write(json);
		printWriter.flush();
		printWriter.close();
	}
	
}
