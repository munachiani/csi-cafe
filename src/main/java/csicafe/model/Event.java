package csicafe.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "events")
public class Event implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String description;

	@Column(nullable = false)
	private String location;

	@Column(name = "start_time", nullable = false)
	private Date startTime;

	@Column(name = "end_time", nullable = false)
	private Date endTime;

	@Column(name="admin_approved",nullable = false)
	private boolean isAdminApproved = false;

	@Column(name="event_organizer",nullable = false)
	private boolean isEventOrganiser = false;

//	@OneToMany(targetEntity = UserEvent.class)
//	@Column(name="event_id")
//	private Set<UserEvent> userEvent = new HashSet<UserEvent>();
	// @ManyToOne(targetEntity= User.class)
	// List<User> user;

	@ManyToMany(targetEntity = Tag.class)
	@Column(nullable = true)
	@JoinTable(name = "event_tags", joinColumns = @JoinColumn(name = "event_id"), inverseJoinColumns = @JoinColumn(name = "tag_id"))
	private Set<Tag> tag;
	
	
	@ManyToOne
	private Reward reward;

	public Event() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Set<Tag> getTag() {
		return tag;
	}

	public void setTag(Set<Tag> tag) {
		this.tag = tag;
	}

	public boolean isAdminApproved() {
		return isAdminApproved;
	}

	public void setAdminApproved(boolean isAdminApproved) {
		this.isAdminApproved = isAdminApproved;
	}

	public boolean isEventOrganiser() {
		return isEventOrganiser;
	}

	public void setEventOrganiser(boolean isEventOrganiser) {
		this.isEventOrganiser = isEventOrganiser;
	}

	public Reward getRewards() {
		return reward;
	}

	public void setRewards(Reward reward) {
		this.reward = reward;
	}
	
	
	
	

//	public boolean isAdmin_approval() {
//		return admin_approval;
//	}

//	public void setAdmin_approval(boolean admin_approval) {
//		this.admin_approval = admin_approval;
//	}
//
//	public boolean isEvent_organizer() {
//		return event_organizer;
//	}
//
//	public void setEvent_organizer(boolean event_organizer) {
//		this.event_organizer = event_organizer;
//	}

//	public Set<UserEvent> getUserEvent() {
//		return userEvent;
//	}
//
//	public void setUserEvent(Set<UserEvent> userEvent) {
//		this.userEvent = userEvent;
//	}

	// public List<User> getUser() {
	// return user;
	// }
	//
	// public void setUser(List<User> user) {
	// this.user = user;
	// }
	//

}
