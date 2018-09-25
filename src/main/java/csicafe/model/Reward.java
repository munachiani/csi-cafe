package csicafe.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

}
