package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Exam {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		private Date dateOfExam;
		private int ocena;
		@ManyToOne
		@JoinColumn(name = "PROFESSOR_ID")
		private Professor professor;
		@ManyToOne
		@JoinColumn(name = "COURSE_ID")
		private Course course;
		@ManyToOne
		@JoinColumn(name = "STUDENT_NRINDEX")
		private Student student;
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public Date getDateOfExam() {
			return dateOfExam;
		}
		public void setDateOfExam(Date dateOfExam) {
			this.dateOfExam = dateOfExam;
		}
		public int getOcena() {
			return ocena;
		}
		public void setOcena(int ocena) {
			this.ocena = ocena;
		}
		public Professor getProfessor() {
			return professor;
		}
		public void setProfessor(Professor professor) {
			this.professor = professor;
		}
		public Course getCourse() {
			return course;
		}
		public void setCourse(Course course) {
			this.course = course;
		}
		public Student getStudent() {
			return student;
		}
		public void setStudent(Student student) {
			this.student = student;
		}
		
		public Exam() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Exam(Date dateOfExam, int ocena, Professor professor, Course course, Student student) {
			super();
			this.dateOfExam = dateOfExam;
			this.ocena = ocena;
			this.professor = professor;
			this.course = course;
			this.student = student;
		}
		
		@Override
		public String toString() {
			return "Exam [id=" + id + ", dateOfExam=" + dateOfExam + ", ocena=" + ocena + ", professor=" + professor
					+ ", course=" + course + ", student=" + student + "]";
		}
		public Exam(long id, Date dateOfExam, int ocena, Professor professor, Course course, Student student) {
			super();
			this.id = id;
			this.dateOfExam = dateOfExam;
			this.ocena = ocena;
			this.professor = professor;
			this.course = course;
			this.student = student;
		}
		
		
		
		
		
		
		
}
