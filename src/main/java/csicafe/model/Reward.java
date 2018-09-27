package csicafe.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rewards")
public class Reward implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	private String organizer;

	private String description;

	@Column(name = "reward_provider")
	private boolean isRewardProvider = false;
	
	
	@Column(name="start_time")
	private Date startTime;
	
	@Column(name="end_time")
	private Date endTime;

	
	@ManyToOne(targetEntity=Event.class)
	private Event events;
	
	@ManyToOne(targetEntity=Tag.class)
	private Tag tags;
	
	@ManyToOne(targetEntity = User.class)
	private User user;
	
	
	@Column(name="reward_criteria")
	private Integer rewardCriteria;
	
	
	public Reward() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrganizer() {
		return organizer;
	}

	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isRewardProvider() {
		return isRewardProvider;
	}

	public void setRewardProvider(boolean isRewardProvider) {
		this.isRewardProvider = isRewardProvider;
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



	public Event getEvents() {
		return events;
	}

	public void setEvents(Event events) {
		this.events = events;
	}

	public Tag getTags() {
		return tags;
	}

	public void setTags(Tag tags) {
		this.tags = tags;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getRewardCriteria() {
		return rewardCriteria;
	}

	public void setRewardCriteria(Integer rewardCriteria) {
		this.rewardCriteria = rewardCriteria;
	}
	
	
	
	
	
	
	
	
	
	

}
