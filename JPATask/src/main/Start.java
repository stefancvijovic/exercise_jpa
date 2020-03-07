package main;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Department;
import model.Person;
import model.Professor;
import model.Role;

public class Start {
		private final EntityManagerFactory emf; 
		public Start() {
			emf = Persistence.createEntityManagerFactory("JPATask");
		}
		
		public void saveProfessor(Professor professor) {
			EntityManager em = emf.createEntityManager();
			
			try {
				em.getTransaction().begin();
				em.persist(professor);
				em.getTransaction().commit();
				System.out.println("USPESNO SACUVANO!");
			} catch (Exception e) {
				System.out.println("DOSLO JE DO GRESKE PRI CUVANJU!");
			} finally {
				em.close();
				emf.close();
			}
		}
	
		public static void main(String[] args) {

			
		}
}
