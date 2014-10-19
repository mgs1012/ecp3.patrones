package es.upm.miw.ecp3.patrones.solitaire.models.DAO.mem;

import es.upm.miw.ecp3.patrones.solitaire.models.DAO.RoundDAO;
import es.upm.miw.ecp3.patrones.solitaire.models.entities.Round;

public class MemRoundDAO extends MemGenericDAO<Round, Integer> implements RoundDAO{

	@Override
	protected Integer getID(Round round) {
		return round.getId();
	}

}
