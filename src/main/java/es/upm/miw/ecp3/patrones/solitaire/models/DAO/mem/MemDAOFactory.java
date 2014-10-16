package es.upm.miw.ecp3.patrones.solitaire.models.DAO.mem;

import es.upm.miw.ecp3.patrones.solitaire.models.DAO.DAOFactory;
import es.upm.miw.ecp3.patrones.solitaire.models.DAO.RoundDAO;
import es.upm.miw.ecp3.patrones.solitaire.models.DAO.UserDAO;

public class MemDAOFactory extends DAOFactory {
	
	public UserDAO getUserDAO(){
		return null;
		
	}

	@Override
	public RoundDAO getRoundDAO() {
		// TODO Auto-generated method stub
		return null;
	}

}
