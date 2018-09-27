package csicafe.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	
	@ManyToOne(targetEntity=College.class)
	private College college;
	
	@ManyToOne(targetEntity=Office.class)
	private Office office;
	
	

//	@OneToMany(mappedBy = "units")
//	private Set<Office> offices;
//	
//	@OneToMany(mappedBy = "units")
//	private Set<College> colleges;

	public OrganizationalUnit() {

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

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Office getOffice() {
		return office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}
	
	
	
	

	
	

}
