package org.program.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Person")

public class Person {
	
	@Column(name="id_Person")
	@GeneratedValue
	@Id
	private int Id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="Adress")
	private String adress;
	
	@Column(name="Street")
	private String street;
	
	@Column(name="postCode")
	private String postCode;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_users")
	Users users;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_Book")
	Book book;
	
	

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	

}
