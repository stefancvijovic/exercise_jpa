package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class StudyProgram {
		@Id
		@Column(name = "STUDYPROGRAM_ID")
		private long id;
		private String name;
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "DEPARTMENT_ID")
		private Department department; 
		@ManyToMany(mappedBy = "studyProgram")
		private List<Course> courses;
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Department getDepartment() {
			return department;
		}
		public void setDepartment(Department department) {
			this.department = department;
		}
		public List<Course> getCourses() {
			return courses;
		}
		public void setCourses(List<Course> courses) {
			this.courses = courses;
		}
		
		public StudyProgram(long id, String name, Department department, List<Course> courses) {
			super();
			this.id = id;
			this.name = name;
			this.department = department;
			this.courses = courses;
		}
		public StudyProgram() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
