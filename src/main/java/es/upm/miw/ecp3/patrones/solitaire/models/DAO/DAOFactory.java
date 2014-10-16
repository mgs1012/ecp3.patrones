package es.upm.miw.ecp3.patrones.solitaire.models.DAO;

public abstract class DAOFactory {
	
	private static DAOFactory daoFactory = null;
	
	public abstract UserDAO getUserDAO();
	
	public abstract RoundDAO getRoundDAO();

	public static DAOFactory getDAOFactory(){
		assert daoFactory != null:"Instancia no inyectada.";
		return daoFactory;
	}

	public static void setDAOFactory(DAOFactory daoFactory){
		DAOFactory.daoFactory = daoFactory;
	}
}
