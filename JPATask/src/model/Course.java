package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Course {
	@Id
	@Column(name = "COURSE_ID")
	//@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	private String name;
	private int ESP;
	private int semester;
	@ManyToMany
	private List<StudyProgram> studyProgram;
	
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
	public int getESP() {
		return ESP;
	}
	public void setESP(int eSP) {
		ESP = eSP;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public List<StudyProgram> getStudyProgram() {
		return studyProgram;
	}
	public void setStudyProgram(List<StudyProgram> studyProgram) {
		this.studyProgram = studyProgram;
	}
	
	public Course(long id, String name, int eSP, int semester, List<StudyProgram> studyProgram) {
		super();
		this.id = id;
		this.name = name;
		ESP = eSP;
		this.semester = semester;
		this.studyProgram = studyProgram;
	}
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", ESP=" + ESP + ", semester=" + semester + ", studyProgram="
				+ studyProgram + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
}
