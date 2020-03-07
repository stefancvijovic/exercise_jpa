package model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	private String name;
	private int ESP;
	private int semester;
	private StudyProgram studyProgram;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="PROFESSOR_ID")
	private Professor proffessor;
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
	public StudyProgram getStudyProgram() {
		return studyProgram;
	}
	public void setStudyProgram(StudyProgram studyProgram) {
		this.studyProgram = studyProgram;
	}
	public Professor getProffessor() {
		return proffessor;
	}
	public void setProffessor(Professor proffessor) {
		this.proffessor = proffessor;
	}
	public Course(long id, String name, int eSP, int semester, StudyProgram studyProgram, Professor proffessor) {
		super();
		this.id = id;
		this.name = name;
		ESP = eSP;
		this.semester = semester;
		this.studyProgram = studyProgram;
		this.proffessor = proffessor;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
