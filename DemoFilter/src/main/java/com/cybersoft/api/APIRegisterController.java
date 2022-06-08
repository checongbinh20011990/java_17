package com.cybersoft.api;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybersoft.common.Constant;
import com.cybersoft.model.UsersModel;
import com.cybersoft.pojo.ResponseData;
import com.cybersoft.pojo.Users;
import com.google.gson.Gson;

@WebServlet("/api/register")
public class APIRegisterController extends HttpServlet {
	
	UsersModel usersModel = new UsersModel();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Users users = new Users();
		users.setFullname(req.getParameter("fullname"));
		users.setEmail(req.getParameter("email"));
		users.setPassword(req.getParameter("password"));
		users.setRole_id(Constant.ROLE_USER);
		
		boolean isSuccess = usersModel.insertUsers(users);
		
		ResponseData responseData = new ResponseData();
		responseData.setSuccess(isSuccess);
		
		if(isSuccess) {
			responseData.setMessage("Thành công");
		}else {
			responseData.setMessage("Thất bại");
		}
		
		Gson gson = new Gson();
		String json = gson.toJson(responseData);
		
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		
		PrintWriter writer = resp.getWriter();
		writer.write(json);
		writer.flush();
		writer.close();
	}
	
	/* 
	 * B1: Tạo một API trả ra danh sách User
	 * B2: Ajax gọi API lấy danh sách user
	 * B3: Lấy dữ liệu gọi từ api append table
	 * */
	
}
