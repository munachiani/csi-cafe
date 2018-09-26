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

	@Column(name = "full_name", nullable = false)
	private String firstname;

	@Column(name = "last_name", nullable = false)
	private String lastname;

	@ManyToOne(targetEntity = Position.class)
	private Set<Position> postion;

	@OneToOne(targetEntity = OrganizationalUnit.class)
	private OrganizationalUnit organizationalUnit;

	@Column(nullable = false, unique = true)
	private String username;

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = true)
	private String title;

	@OneToOne(targetEntity = Program.class)
	private Program program;

//	@OneToMany(targetEntity = UserEvent.class)
//	private Set<UserEvent> userEvent = new HashSet<UserEvent>();

	@JsonProperty(access = Access.WRITE_ONLY)
	@Column(nullable = false)
	private String password;
	
	
	 @ManyToMany
	    @JoinTable(name = "authorities",
	        joinColumns = @JoinColumn(name = "user_id"),
	        inverseJoinColumns = @JoinColumn(name = "role_id"))@ManyToOne(targetEntity = Role.class)
	Set<Role> roles;
	 
	 private boolean enabled = true;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public User() {
		roles = new HashSet<Role>();
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

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}

	public Set<Position> getPostion() {
		return postion;
	}

	public void setPostion(Set<Position> postion) {
		this.postion = postion;
	}

	public OrganizationalUnit getOrganizationalUnit() {
		return organizationalUnit;
	}

	public void setOrganizationalUnit(OrganizationalUnit organizationalUnit) {
		this.organizationalUnit = organizationalUnit;
	}

	@JsonIgnore
	public boolean isAdmin(int role_id) {
		for (Role role : roles) {
			if (role_id == role.getId())
				return true;
		}

		return false;
	}

//	public Set<UserEvent> getUserEvent() {
//		return userEvent;
//	}
//
//	public void setUserEvent(Set<UserEvent> userEvent) {
//		this.userEvent = userEvent;
//	}

}