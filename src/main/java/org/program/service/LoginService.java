package org.program.service;
import java.util.List;

public interface LoginService{    
       public boolean checkLogin(String userName, String userPassword);
       
       public List<String> listOfAccount();
}