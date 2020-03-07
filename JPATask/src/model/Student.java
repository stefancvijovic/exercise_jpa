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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
//@DiscriminatorValue("STUDENT")
public class Student implements Serializable  {  //extends Person
		private static final long serialVersionUID = 3052020100500L;
		@Id
		@Column(name = "STUDENT_NRINDEX")
		//@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int nrOfIndex;
		private String firstname;
		private String lastname;
		private Date DateofBirth;
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "STUDYPROGRAM_ID")
		private StudyProgram studyProgram;
		@OneToMany(mappedBy = "student")
		private List<Exam> passedExams;
		public int getNrOfIndex() {
			return nrOfIndex;
		}
		public void setNrOfIndex(int nrOfIndex) {
			this.nrOfIndex = nrOfIndex;
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
		public Date getDateofBirth() {
			return DateofBirth;
		}
		public void setDateofBirth(Date dateofBirth) {
			DateofBirth = dateofBirth;
		}
		public StudyProgram getStudyProgram() {
			return studyProgram;
		}
		public void setStudyProgram(StudyProgram studyProgram) {
			this.studyProgram = studyProgram;
		}
		public List<Exam> getPassedExams() {
			return passedExams;
		}
		public void setPassedExams(List<Exam> passedExams) {
			this.passedExams = passedExams;
		}
		
		public Student(int nrOfIndex, String firstname, String lastname, Date dateofBirth, StudyProgram studyProgram,
				List<Exam> passedExams) {
			super();
			this.nrOfIndex = nrOfIndex;
			this.firstname = firstname;
			this.lastname = lastname;
			DateofBirth = dateofBirth;
			this.studyProgram = studyProgram;
			this.passedExams = passedExams;
		}
		
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			return "Student [nrOfIndex=" + nrOfIndex + ", firstname=" + firstname + ", lastname=" + lastname
					+ ", DateofBirth=" + DateofBirth + ", studyProgram=" + studyProgram + ", passedExams=" + passedExams
					+ "]";
		}
		
		
		
		
		
		
		
		
		
		
		

		

		
		
		
		
		
}
