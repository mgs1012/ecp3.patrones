package es.upm.miw.ecp3.patrones.solitaire.models.DAO;

import java.util.List;

public abstract interface GenericDAO<T, ID> {

	public abstract void create(T entity);
	
	public abstract T read(ID id);
	
	public abstract void update(T entity);
	
	public abstract void delete(T entity);
	
	public abstract void deleteByID(ID id);
	
	public abstract List<T> findAll();
	
	public abstract List<T> findAll(int index, int size);
	

}
