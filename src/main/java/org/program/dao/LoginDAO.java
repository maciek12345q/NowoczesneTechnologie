package org.program.dao;
import org.program.model.*;

public interface LoginDAO{    
       public boolean checkLogin(String userName, String userPassword);
      
}