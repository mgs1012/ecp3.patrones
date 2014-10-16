package es.upm.miw.ecp3.patrones.solitaire.models.DAO.mem;

import es.upm.miw.ecp3.patrones.solitaire.models.DAO.GenericDAO;

public class MemGenericDAO<T, ID> implements GenericDAO<T, ID>{
	
	public void create(T entity) {
	}
	
	public T read(ID id) {
		return null;
	}
	
	public void update(T entity) {
	}
	
	public void delete(T entity) {
	}
	
	public void deleteByID(ID id) {
	}
	
	public void findAll() {
	}
	
	public void findAll(int index, int size) {
	}
	

}
