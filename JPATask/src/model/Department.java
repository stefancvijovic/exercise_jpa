package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@Column (name = "department_id")
	private String name;
	@OneToMany //dodati
	private List<Professor> professor;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Professor> getProfessor() {
		return professor;
	}
	public void setProfessor(List<Professor> professor) {
		this.professor = professor;
	}
	public Department(String name, List<Professor> professor) {
		super();
		this.name = name;
		this.professor = professor;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
