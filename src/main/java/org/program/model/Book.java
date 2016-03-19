package org.program.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Book")
public class Book {
	
	@Id
	@GeneratedValue
	@Column(name="id_book")
	private int id;
	
	@Column(name="Title")
	private String title;
	
	@Column(name="Author")
	private String author;
	
	@Column(name="Category")
	private String category;
	
	@Column(name="numberOfBook")
	private Integer numberOfBook;
	
	@Column(name="nsbn")
	private String nsbn;
	
	@Column(name="id_person")
	@OneToMany(mappedBy="book")
	private Collection<Person> person = new ArrayList<Person>();
	



	public Collection<Person> getPerson() {
		return person;
	}

	public void setPerson(Collection<Person> person) {
		this.person = person;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}


	public Integer getNumberOfBook() {
		return numberOfBook;
	}

	public void setNumberOfBook(Integer numberOfBook) {
		this.numberOfBook = numberOfBook;
	}

	public String getNsbn() {
		return nsbn;
	}

	public void setNsbn(String nsbn) {
		this.nsbn = nsbn;
	}
	
	

}
