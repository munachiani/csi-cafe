package csicafe.model;

import java.io.Serializable;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "programs")
public class Program implements Serializable {

	  private static final long serialVersionUID = 1L;

	    @Id
	    @GeneratedValue
	    private Long id;
	    
	    @Column(nullable=false)
	    private String name;
	    
	    @Column(nullable=false)
	    private String program_name;
	    
	    
	    @Column(nullable=false)
	    private String description;
	    
//	    @OneToOne(mappedBy="program")
//	    private User user;
	    
	    
	    public Program() {
	    	
	    }
	    
	    
	    public Program(Long id, String name, String program_name, String description) {
	    	this.id = id;
	    	this.name = name;
	    	this.program_name = program_name;
	    	this.description = description;
	    	
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


		public String getFullName() {
			return program_name;
		}


		public void setFullName(String fullName) {
			this.program_name = fullName;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


//		public User getUser() {
//			return user;
//		}
//
//
//		public void setUser(User user) {
//			this.user = user;
//		}
		
	
		
	    
	    
}
