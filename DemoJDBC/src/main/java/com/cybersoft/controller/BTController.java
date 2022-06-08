package com.cybersoft.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybersoft.connection.MySQLConnection;
import com.cybersoft.model.PhimModel;
import com.mysql.cj.MysqlConnection;

@WebServlet("/baitap")
public class BTController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setAttribute("phims", getPhims());
		req.getRequestDispatcher("baitap.jsp")
		.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PhimModel phimModel = new PhimModel();
		phimModel.setTenPhim(req.getParameter("tenphim"));
		phimModel.setDaoDien(req.getParameter("daodien"));
		phimModel.setTenQuocGia(req.getParameter("quocgia"));
		
		Connection con = MySQLConnection.getConnection();
		String sql = "insert into phim(ten_phim,dao_dien,ten_quoc_gia) values (?,?,?)";
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1,phimModel.getTenPhim() );
			statement.setString(2,phimModel.getDaoDien());
			statement.setString(3,phimModel.getTenQuocGia());
			
			int result = statement.executeUpdate();
			
			con.close();
			
			if(result > 0) {
				System.out.println("Success");
			}else {
				System.out.println("Fail");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		req.setAttribute("phims", getPhims());
		req.getRequestDispatcher("baitap.jsp")
		.forward(req, resp);
	}
	
	private List<PhimModel> getPhims(){
		List<PhimModel> phims = new ArrayList<>();
		Connection con = MySQLConnection.getConnection();
		String sql = "select * from phim";
		
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			ResultSet result = preparedStatement.executeQuery();
			while(result.next()) {
				PhimModel phimModel = new PhimModel();
				phimModel.setTenPhim(result.getString("ten_phim"));
				phimModel.setId(result.getInt("id"));
				phimModel.setDaoDien(result.getString("dao_dien"));
				phimModel.setTenQuocGia(result.getString("ten_quoc_gia"));
			
				phims.add(phimModel);
			}
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return phims;
	}
	
}
