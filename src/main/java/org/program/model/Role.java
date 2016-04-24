package org.program.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Role")
public class Role {
	
	 	@Id
	    @GeneratedValue
	    @Column(name="id_role")
	    private Integer id;
	     
	    private String role;
	     
	    @Column(name="fk_users")
	    @OneToMany(mappedBy="role")
	    private Set<Users> userRoles;
	 
	    public Integer getId() {
	        return id;
	    }
	 
	    public void setId(Integer id) {
	        this.id = id;
	    }
	 
	    public String getRole() {
	        return role;
	    }
	 
	    public void setRole(String role) {
	        this.role = role;
	    }
	 
	    public Set<Users> getUserRoles() {
	        return userRoles;
	    }
	 
	    public void setUserRoles(Set<Users> userRoles) {
	        this.userRoles = userRoles;
	    }

}
