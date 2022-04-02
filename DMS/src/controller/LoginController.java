/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import repository.*;
import models.*;

	
public class LoginController {
	    
    private static Login currentUser = null;
    
    public static Login getCurrentUser() {
        return currentUser;
    }
    public static boolean login(String user, String pass) throws SQLException {
       
        LoginRepo loginRepository = new LoginRepo();
        List<Login> logins = loginRepository.getLogin();
        
        for ( Login login: logins) {
            if ( login.getUser().equals(user) && login.getPass().equals(pass)) {
                currentUser = login;
            }
            else{
                System.out.println("invalid user and pass!!!");
            }
        }
        return currentUser != null;
    }
}
