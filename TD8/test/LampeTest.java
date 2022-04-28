import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * classe de test permettant de tester la classe Lampe
 */
public class LampeTest {

	/**
	 * test du constructeur de lampe
	 */
	@Test
	public void testLampe() {
		// methode testee
		Lampe l = new Lampe("lampe1");

		// verification
		boolean res = l.isAllume();
		assertFalse(res, "une nouvelle lampe devrait etre eteinte");
	}


	/**
	 * test allumer une lampe eteinte
	 */
	@Test
	public void testAllumer() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");

		//methode testee
		l.allumer();

		// verification
		boolean res = l.isAllume();
		assertTrue(res, "apres allumer, la lampe devrait etre allumee");
	}

	@Test
	/**
	 * test allumer une lampe allumee
	 */
	public void testAllumer_allumee() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");
		l.allumer();

		//methode testee
		l.allumer();

		// verification
		boolean res = l.isAllume();
		assertTrue(res,"apres allumer, la lampe devrait etre allumee");
	}

	@Test
	/**
	 * test eteindre une lampe allumee
	 */
	public void testeteindre_allumee() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");
		l.allumer();

		//methode testee
		l.eteindre();

		// verification
		boolean res = l.isAllume();
		assertFalse(res,"apres eteindre, la lampe devrait etre eteinte");
	}

	@Test
	/**
	 * test to String lampe eteinte
	 */
	public void testToString_eteinte() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");

		//methode testee
		String r=""+l;

		//verification
		assertEquals("lampe1: Off",r,"affichage devrait etr off");
	}

	@Test
	/**
	 * test to String lampe allumee
	 */
	public void testToString_allumee() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");
		l.allumer();

		//methode testee
		String r=""+l;

		//verification
		assertEquals("lampe1: On",r,"affichage devrait etr off");

	}

}
