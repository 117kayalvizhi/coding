package manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AddAccount {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		bank b = em.find(bank.class, 1);
		if (b != null) {

			account a = new account();
			a.setAccno(3456789);
			a.setAname("kayal");
			a.setAddress("theni");
			a.setDob("08\01\2003");

			a.setMobile(987654321);
			a.setB(b);
			et.begin();
			em.persist(a);

			et.commit();
			System.out.println("data added");

		}

	}
}