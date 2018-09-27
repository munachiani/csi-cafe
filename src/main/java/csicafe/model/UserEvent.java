package csicafe.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import csicafe.model.Event;
import csicafe.model.User;

@Entity
@Table(name = "user_events")
public class UserEvent implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne(targetEntity = User.class)
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne(targetEntity = csicafe.model.Event.class)
	@JoinColumn(name = "event_id")
	private Event event;

	private boolean isAttending = false;

	public UserEvent() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public boolean isAttending() {
		return isAttending;
	}

	public void setAttending(boolean isAttending) {
		this.isAttending = isAttending;
	}

}
