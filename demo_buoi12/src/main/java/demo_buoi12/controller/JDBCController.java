package demo_buoi12.controller;

import java.io.IOException;
import java.io.PrintWriter;
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

import com.google.gson.Gson;

import demo_buoi12.jdbc.JDBCConnection;
import demo_buoi12.jdbc.PhimModel;

@WebServlet("/jdbc")
public class JDBCController extends HttpServlet {
	private static final long serialVersionUID = 1234007927189508568L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<PhimModel> phimModels = new ArrayList<PhimModel>();
		Connection connection =  JDBCConnection.getConnection();
		
		String query = "select * from phim";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet res = preparedStatement.executeQuery();
			while(res.next()) {
				PhimModel phimModel = new PhimModel();
				phimModel.setId(res.getInt("id"));
				phimModel.setDaoDien(res.getString("dao_dien"));
				phimModel.setTenPhim(res.getString("ten_phim"));
				phimModel.setTenQuocGia(res.getString("ten_quoc_gia"));

				phimModels.add(phimModel);
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PrintWriter printWriter = resp.getWriter();
		Gson gson = new Gson();
		String json = gson.toJson(phimModels);
		
		printWriter.write(json);
		printWriter.flush();
		printWriter.close();
		
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		
//		req.setAttribute("phims", phimModels);
//		req.getRequestDispatcher("phim.jsp").forward(req, resp);
	}

}
