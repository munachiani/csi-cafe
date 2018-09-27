package csicafe.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "first_name", nullable = false)
	private String firstname;

	@Column(name = "last_name", nullable = false)
	private String lastname;

	@ManyToOne(targetEntity = Position.class)
	private Position position;


	@Column(nullable = false, unique = true)
	private String username;

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = true)
	private String title;

	@OneToOne(targetEntity = Program.class)
	private Program program;

	@ManyToOne(targetEntity = OrganizationalUnit.class)
	private OrganizationalUnit organization_unit;

	// @OneToMany(targetEntity = UserEvent.class)
	// private Set<UserEvent> userEvent = new HashSet<UserEvent>();

	@Column(nullable = false)
	private String password;

	@ManyToOne(targetEntity = Role.class)
	private Role roles;

	private boolean enabled = true;

	public User() {
		// roles = new HashSet<Role>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRoles() {
		return roles;
	}

	public void setRoles(Role roles) {
		this.roles = roles;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// public Program getProgram() {
	// return program;
	// }
	//
	// public void setProgram(Program program) {
	// this.program = program;
	// }

	// public OrganizationalUnit getOrganizationalUnit() {
	// return organizationalUnit;
	// }
	//
	// public void setOrganizationalUnit(OrganizationalUnit organizationalUnit) {
	// this.organizationalUnit = organizationalUnit;
	// }

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}

	public OrganizationalUnit getOrganization_unit() {
		return organization_unit;
	}

	public void setOrganization_unit(OrganizationalUnit organization_unit) {
		this.organization_unit = organization_unit;
	}

//	public Set<Event> getEvents() {
//		return events;
//	}
//
//	public void setEvents(Set<Event> events) {
//		this.events = events;
//	}
//	
//	

	// public Position getPosition() {
	// return position;
	// }
	//
	// public void setPosition(Position position) {
	// this.position = position;
	// }

}