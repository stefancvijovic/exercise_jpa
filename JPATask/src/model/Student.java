package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
//@DiscriminatorValue("STUDENT")
public class Student  {  //extends Person
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
		
		

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		
		
		
		
		
}
