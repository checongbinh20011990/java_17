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

@WebServlet("/jdbc")
public class DemoJDBCController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
		
		req.setAttribute("phims", phims);
		req.getRequestDispatcher("demojdbc.jsp")
		.forward(req, resp);
	}
	
}
