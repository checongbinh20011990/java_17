package com.cybersoft.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cybersoft.connection.MySQLConnection;
import com.cybersoft.pojo.User;

public class UserModel {
	
	public boolean insertUser(User user) {
		
		Connection connection = MySQLConnection.getConnection();
		String sql = "insert into users(email,password,fullname,avatar,role_id) values (?,?,?,?,?)";
		boolean isSuccess = false;
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, user.getEmail());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getFullname());
			statement.setString(4, user.getAvatar());
			statement.setInt(5, user.getRole_id());
			
			int result = statement.executeUpdate();
			if(result > 0 ) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public User getUsersByEmailAndPassword(String email, String password) {
		User user2 = new User();
		Connection connection = MySQLConnection.getConnection();
		
		String sql = "select * from users where email = ? and password = ?";
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, email);
			statement.setString(2, password);
			
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				user2.setFullname(resultSet.getString("fullname"));
				user2.setEmail(resultSet.getString("email"));
				user2.setRole_id(resultSet.getInt("role_id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user2;
	}
	
}
