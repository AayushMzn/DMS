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

public class EmployeeRepo {
	public List<Employee> getEmployee() throws SQLException{
		Connection connection = DBconnection.getConnection();
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery("Select * from employee");
		List<Employee> employee=new ArrayList<>();
		
		while (rs.next()) {
			Employee employees = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4));
			employee.add(employees);
		}
		return employee;
	}

	public void addToEmployee(int e_id,String e_name,String e_address,int e_phone)throws SQLException{
		Connection connection=DBconnection.getConnection();
		Statement statement=connection.createStatement();
		statement.executeUpdate("INSERT INTO Employee values("+e_id+","+e_name+","+e_phone+","+e_address+")");
	}
}

