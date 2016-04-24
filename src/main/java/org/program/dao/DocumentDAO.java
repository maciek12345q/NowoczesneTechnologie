package org.program.dao;

import java.util.List;

public interface DocumentDAO {
	
	public void save(DocumentDAO document);
	
	public List<DocumentDAO> list();
	
	public void remove(Integer id);
	
	public DocumentDAO get(Integer id);
	

}
