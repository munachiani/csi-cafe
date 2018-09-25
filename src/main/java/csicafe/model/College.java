package csicafe.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "colleges")
public class College implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@OneToMany(mappedBy = "college")
	private Set<Department> departments;

	@ManyToOne
	private OrganizationalUnit units;

	public College() {
		// TODO Auto-generated constructor stub
	}

	public College(Long id, String name, Set<Department> departments) {

		this.id = id;
		this.name = name;
		this.departments = departments;

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

	public Set<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}

	public OrganizationalUnit getUnits() {
		return units;
	}

	public void setUnits(OrganizationalUnit units) {
		this.units = units;
	}
	
	

}
