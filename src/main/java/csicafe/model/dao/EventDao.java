package csicafe.model.dao;

import java.util.List;

import csicafe.model.Event;

public interface EventDao {
	
	Event getEvent( Long id );

    List<Event> getEventss();


}
