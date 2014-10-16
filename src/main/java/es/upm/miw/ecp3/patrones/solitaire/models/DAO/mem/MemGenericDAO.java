package es.upm.miw.ecp3.patrones.solitaire.models.DAO.mem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.upm.miw.ecp3.patrones.solitaire.models.DAO.GenericDAO;

public abstract class MemGenericDAO<T, ID> implements GenericDAO<T, ID>{
	
	private Map<ID, T> entities = new HashMap<ID, T>();
	
	public void create(T entity) {
		assert !this.entities.containsKey(this.getID(entity)):  "Error: Entidad ya existe.";
		this.entities.put(this.getID(entity), entity);
	}
	
	public T read(ID id) {
		 return this.entities.get(id);
	}
	
	public void update(T entity) {
		assert this.entities.containsKey(this.getID(entity)):  "Error: Entidad no existe.";
		this.entities.put(this.getID(entity), entity);
	}
	
	public void delete(T entity) {
		assert this.entities.containsKey(this.getID(entity)):  "Error: Entidad no existe.";
		this.entities.remove(this.getID(entity));
	}
	
	public void deleteByID(ID id) {
		assert this.entities.containsKey(id):  "Error: Entidad no existe.";
		this.entities.remove(id);
	}
	
	public List<T> findAll() {
		return new ArrayList<T>(this.entities.values());
	}
	
	public List<T> findAll(int index, int size) {
		
		List<T> lista = new ArrayList<T>(this.entities.values());
		
		return lista.subList(index, size);
		
	}
	
	protected abstract ID getID(T entity);

}
