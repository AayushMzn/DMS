/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import main.DBconnection;
import java.sql.*;
import java.util.*;
import models.*;

public class LoginRepo {
	public List<Login> getLogin() throws SQLException{
		Connection connection = DBconnection.getConnection();
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery("Select * from Login");
		List<Login> login=new ArrayList<>();
		
		while (rs.next()) {
			Login logins = new Login(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4));
			login.add(logins);
		}
		return login;
	}

	public void addToLogin(String user,String pass,int type)throws SQLException{
		Connection connection=DBconnection.getConnection();
		Statement statement=connection.createStatement();
		statement.executeUpdate("INSERT INTO Login values("+user+","+pass+","+type+")");
	}
}

