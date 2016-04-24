package org.program.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.program.dao.UsersDAO;
import org.program.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly=true)
public class CustomUserDetailsService implements UserDetailsService {
	

	private UsersDAO usersDAO;
	
	
	public UsersDAO getUsersDAO() {
		return usersDAO;
	}

	public void setUsersDAO(UsersDAO usersDAO) {
		this.usersDAO = usersDAO;
	}

	
	public Collection getAuthorities(Integer role) {
		
        List authList = getGrantedAuthorities(getRoles(role));
        return authList;
    }

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Users users = usersDAO.getUser(username);
		
		boolean enabled = true;
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;
		  
		return new org.springframework.security.core.userdetails.User(
				users.getUserName(), 
				users.getUserPassword(), 
				enabled, 
				accountNonExpired, 
				credentialsNonExpired, 
				accountNonLocked,
				getAuthorities(users.getRole().getId()));

	}
	
	
	 public List getRoles(Integer role) {
		 	        List roles = new ArrayList();

		 	        if (role.intValue() == 1) {
		 	            roles.add("ROLE_MODERATOR");
		 	            roles.add("ROLE_ADMIN");
		 	        } else if (role.intValue() == 2) {
		 	            roles.add("ROLE_MODERATOR");
		 	        }
		 	        return roles;
		 	    }
	 
		 	    public static List getGrantedAuthorities(List<String> roles) {

		 	        List authorities = new ArrayList();
		 	        for (String role : roles) {
		 	            authorities.add(new SimpleGrantedAuthority(role));
		 	        }
		 	        return authorities;

		 	    }
	
	
	

	
	

}
