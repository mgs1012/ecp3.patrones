package es.upm.miw.ecp3.patrones.solitaire.models.DAO.mem;

import es.upm.miw.ecp3.patrones.solitaire.models.DAO.UserDAO;
import es.upm.miw.ecp3.patrones.solitaire.models.entities.User;

public class MemUserDAO extends MemGenericDAO<User, Integer> implements UserDAO{

	@Override
	protected Integer getID(User entity) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
