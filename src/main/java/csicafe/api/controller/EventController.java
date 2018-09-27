package csicafe.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import csicafe.model.Event;
import csicafe.model.dao.EventDao;


@RestController
public class EventController {
	
	@Autowired
	private EventDao eventDao;
	
	
	@RequestMapping(value= "/events/{id}", method = RequestMethod.GET)
	public Event getEvent(@PathVariable Long id) {
		
		return eventDao.getEvent(id);
		
	}
	
	  @RequestMapping(value = "/events", method = RequestMethod.GET)
	    public List<Event> getAllEvents()
	    {
	        return eventDao.getAllEvents();
	    }
	  
	  

}
