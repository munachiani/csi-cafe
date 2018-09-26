package csicafe.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tags")
public class Tag implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	
	@Column(name="event_type",nullable = false)
	private String eventType;
	
	@Column(nullable = false)
	private String content;
	
	@Column(nullable = false)
	private String affilications;
	
//	@Column(name="event_organizer",nullable = false)
//	private boolean event_organizer = false;
//	
	

	@ManyToMany(mappedBy="tag", targetEntity = Event.class)
	private List<Event> event;
	
	public Tag() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAffilications() {
		return affilications;
	}

	public void setAffilications(String affilications) {
		this.affilications = affilications;
	}

	public List<Event> getEvent() {
		return event;
	}

	public void setEvent(List<Event> event) {
		this.event = event;
	}
	
//	public boolean isEvent_organizer() {
//		return event_organizer;
//	}
//
//	public void setEvent_organizer(boolean event_organizer) {
//		this.event_organizer = event_organizer;
//	}
//	
	

}
