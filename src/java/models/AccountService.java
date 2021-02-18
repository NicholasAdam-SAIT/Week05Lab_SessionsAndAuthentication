/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * Class that handles login authentication.
 * @author 840018
 */
public class AccountService {
    
    /**
     * login method performs basic checks to determine whether the login
     * credentials provided in the login jsp are valid.
     * @param username
     * @param password
     * @return 
     */
    public User login(String username, String password)
    {
        User validUser = null;
        if(password.equals("password"))
       {
            if (username.equals("adam") || username.equals("betty"))
            {
                validUser = new User(username, password);
            }
               
       }
       return validUser;
    }
}
