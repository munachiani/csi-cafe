package csicafe.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import csicafe.model.Event;
import csicafe.model.dao.EventDao;


@Repository
public class EventDaoImpl implements EventDao {
	
	  @PersistenceContext
	    private EntityManager entityManager;

	@Override
	public Event getEvent(Long id) {
		return entityManager.find( Event.class, id );
	}

	@Override
	public List<Event> getEventss() {
		return entityManager.createQuery( "from Event", Event.class )
	            .getResultList();
	}

}
