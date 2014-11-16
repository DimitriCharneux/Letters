package letters.test;

import static org.junit.Assert.*;
import letters.City;
import letters.Inhabitant;
import letters.content.Money;
import letters.content.Text;
import letters.letters.Acknowledgment;
import letters.letters.PromissoryNote;
import letters.letters.RegisteredLetter;
import letters.letters.SimpleLetter;
import letters.letters.Thanks;
import letters.letters.UrgentLetter;

import org.junit.Before;
import org.junit.Test;

public class TestLetters {
	City city;
	Inhabitant sender, receiver;
	@Before
	public void init(){
		city = new City();
		sender = new Inhabitant("toto", city);
		receiver = new Inhabitant("tata", city);
	}
	
	@Test
	public void testSimpleLetter() {
		Text text = new Text("salut");
		SimpleLetter letter = new SimpleLetter(sender, receiver, "salut");
		assertEquals(1, letter.cout());
		assertEquals(text, letter.getContent());
		assertEquals(sender, letter.getSender());
		assertEquals(receiver, letter.getReceiver());
		String str = "a simple letter whose content is a text content (salut)";
		assertEquals(str, letter.toString());
	}
	
	@Test
	public void testPromissoryNote() {
		Money money = new Money(50);
		PromissoryNote letter = new PromissoryNote(sender, receiver, 50);
		assertEquals(6, letter.cout());
		assertEquals(money, letter.getContent());
		String str = "a promissory note letter whose content is a money content (50)";
		assertEquals(str, letter.toString());
	}
	
	@Test
	public void testThanks() {
		Text text = new Text("Thank you toto");
		PromissoryNote p = new PromissoryNote(sender, receiver, 50);
		Thanks letter = new Thanks(p);
		assertEquals(1, letter.cout());
		assertEquals(text, letter.getContent());
		String str = "a thanks letter whose content is a text content (Thank you toto)";
		assertEquals(str, letter.toString());
	}
	
	@Test
	public void testRegisteredLetter() {
		SimpleLetter l = new SimpleLetter(sender, receiver, "salut");
		RegisteredLetter<SimpleLetter> letter = new RegisteredLetter<SimpleLetter>(sender, receiver, l);
		assertEquals(16, letter.cout());
		assertEquals(l, letter.getContent());
		String str = "a registered letter whose content is a simple letter whose content is a text content (salut)";
		assertEquals(str, letter.toString());
	}
	
	@Test
	public void testAcknowledgment() {
		Text text = new Text("Acknowledgment toto");
		SimpleLetter l = new SimpleLetter(sender, receiver, "salut");
		RegisteredLetter<SimpleLetter> rl = new RegisteredLetter<SimpleLetter>(sender, receiver, l);
		Acknowledgment letter = new Acknowledgment(l);
		assertEquals(1, letter.cout());
		assertEquals(text, letter.getContent());
		String str = "an acknowledgment of receipt";
		assertEquals(str, letter.toString());
	}
	
	@Test
	public void testUrgentLetter() {
		SimpleLetter l = new SimpleLetter(sender, receiver, "salut");
		UrgentLetter<SimpleLetter> letter = new UrgentLetter<SimpleLetter>(sender, receiver, l);
		assertEquals(2, letter.cout());
		assertEquals(l, letter.getContent());
		String str = "an urgent letter whose content is a simple letter whose content is a text content (salut)";
		assertEquals(str, letter.toString());
	}

}
