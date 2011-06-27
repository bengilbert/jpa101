package demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	
	private EntityManager em = null;
	
	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("manager1");
		em = emf.createEntityManager();
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		EntityTransaction et = em.getTransaction();
		
		Dog dog = new Dog();
		dog.setFavoriteToy("stick");
		et.begin();
		em.merge(dog);
		et.commit();

	}
}
