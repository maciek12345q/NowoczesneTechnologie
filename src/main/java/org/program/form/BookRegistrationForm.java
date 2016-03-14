package org.program.form;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class BookRegistrationForm {
	
	
	@NotEmpty
	@Size(min=1,max=50)
	private String title;
	@NotEmpty
	@Size(min=1,max=50)
	private String author;
	@NotEmpty
	@Size(min=1,max=20)
	private String nsbn;
	@NotEmpty
	@Size(min=1,max=50)
	private String category;
	@NotEmpty
	private int nubmerOfBook;
	
	
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
	public String getNsbn() {
		return nsbn;
	}
	public void setNsbn(String nsbn) {
		this.nsbn = nsbn;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getNubmerOfBook() {
		return nubmerOfBook;
	}
	public void setNubmerOfBook(int nubmerOfBook) {
		this.nubmerOfBook = nubmerOfBook;
	}
	

}
