package letters.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import letters.City;
import letters.Inhabitant;
import letters.letters.SimpleLetter;

import org.junit.Test;

public class TestCity {
	City city;
	
	@Test
	public void testName() {
		city = new City("Paris");
		assertEquals("Paris", city.getName());
	}

	@Test
	public void testInhabitant() {
		city = new City();
		Inhabitant hab = new Inhabitant("toto", city);
		city.add(hab);
		assertEquals(hab, city.getInhabitant(0));
	}
	
	@Test
	public void testEmptyLetter(){
		city = new City();
		assertTrue(city.isEmptyLetters());
		Inhabitant hab = new Inhabitant("toto", city);
		city.sendLetter(new SimpleLetter(hab, hab, "je m'envoie des lettres"));
		assertFalse(city.isEmptyLetters());
	}
}
