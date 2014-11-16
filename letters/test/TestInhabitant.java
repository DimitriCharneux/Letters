package letters.test;

import static org.junit.Assert.*;
import letters.City;
import letters.Inhabitant;
import letters.letters.SimpleLetter;

import org.junit.Before;
import org.junit.Test;

public class TestInhabitant {
	City city;
	Inhabitant hab, hab2;
	@Before
	public void init(){
		city = new City();
		hab = new Inhabitant("toto", city);
		hab2 = new Inhabitant("tata", city);
	}
	
	
	@Test
	public void testGetters() {
		assertEquals("toto", hab.getName());
		assertEquals(0, hab.getAmount(), 0);
	}

	@Test
	public void testDebitCredit() {
		assertEquals(0, hab.getAmount(), 0);
		hab.credit(150);
		assertEquals(150, hab.getAmount(), 0);
		hab.debit(50);
		assertEquals(100, hab.getAmount(), 0);
	}
	
	@Test
	public void testLetter() {
		hab.sendLetter(new SimpleLetter(hab, hab2, "salut"));
		assertEquals(-1, hab.getAmount(), 0);
	}
	
}
