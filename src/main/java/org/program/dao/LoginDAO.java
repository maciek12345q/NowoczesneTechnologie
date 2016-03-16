package org.program.dao;
import java.util.List;

public interface LoginDAO{    
       public boolean checkLogin(String userName, String userPassword);
       
       public List<String> listOfAccount();
      
}