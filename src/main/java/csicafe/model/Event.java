package csicafe.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
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
@Table(name = "csi_events")
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
	private Timestamp startTime;

	@Column(name = "end_time", nullable = false)
	private Timestamp endTime;

	@Column(name = "admin_approved", nullable = false)
	private boolean isAdminApproved = false;

	@Column(name = "admin_reviewd", nullable = false)
	private boolean isAdminReviewd = false;

	@Column(name = "event_organizer", nullable = false)
	private boolean isEventOrganiser = false;

	@ManyToMany(targetEntity = Tag.class)
	@JoinTable(name = "event_tags", joinColumns = { @JoinColumn(name = "event_id") }, inverseJoinColumns = {
			@JoinColumn(name = "tag_id") })
	private Set<Tag> tags;
	
	@ManyToOne(targetEntity = User.class)
	private User user;
	
//	@ManyToMany(targetEntity = User.class)
//	@JoinTable(name = "csi_events_users", joinColumns = { @JoinColumn(name = "event_id") }, inverseJoinColumns = {
//			@JoinColumn(name = "user_id") })
//	private Set<User> users;
	
//	@ManyToMany(targetEntity=User.class)
//	private Set<User> users;

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

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Set<Tag> getTags() {
		return tags;
	}

	public void setTags(Set<Tag> tags) {
		this.tags = tags;
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

	public boolean isAdminReviewd() {
		return isAdminReviewd;
	}

	public void setAdminReviewd(boolean isAdminReviewd) {
		this.isAdminReviewd = isAdminReviewd;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

//	public Set<User> getUsers() {
//		return users;
//	}
//
//	public void setUsers(Set<User> users) {
//		this.users = users;
//	}
//
//	
//	


}
