package csicafe.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "organizational_units")
public class OrganizationalUnit implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String name;

	@OneToMany(mappedBy = "units")
	private Set<Office> offices;
	
	@OneToMany(mappedBy = "units")
	private Set<College> colleges;

	public OrganizationalUnit() {

	}

	public OrganizationalUnit(Long id, String name, Set<Office> offices, Set<College> colleges) {
			
		this.id = id;
		this.name = name;
		this.offices = offices;
		this.colleges = colleges;
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

	public Set<Office> getOffices() {
		return offices;
	}

	public void setOffices(Set<Office> offices) {
		this.offices = offices;
	}

	// public Set<College> getColleges() {
	// return colleges;
	// }
	//
	//
	// public void setColleges(Set<College> colleges) {
	// this.colleges = colleges;
	// }
	//
	//

}
