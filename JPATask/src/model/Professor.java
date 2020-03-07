package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
//@DiscriminatorValue("PROFESSOR")
public class Professor implements Serializable { // extends Person
	private final static long serialVersionUID = 3052020095700L;
	@Id
	@Column(name = "PROFESSOR_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String firstname;
	private String lastname;
	private String title;
	private Date dateOfContract;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id")
	private Department department;
	@OneToMany(mappedBy = "proffessor")
	private List<Course> listCourses;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDateOfContract() {
		return dateOfContract;
	}

	public void setDateOfContract(Date dateOfContract) {
		this.dateOfContract = dateOfContract;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Course> getListCourses() {
		return listCourses;
	}

	public void setListCourses(List<Course> listCourses) {
		this.listCourses = listCourses;
	}

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
