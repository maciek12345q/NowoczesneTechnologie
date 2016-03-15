package org.program.form;

import javax.validation.constraints.Size;

public class SearchBookForm {
	
	@Size(min=1,max=50)
	private String title;
	@Size(min=1,max=50)
	private String author;

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
	

}
