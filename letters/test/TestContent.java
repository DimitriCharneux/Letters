package letters.test;

import static org.junit.Assert.assertEquals;
import letters.content.Money;
import letters.content.Text;

import org.junit.Test;

public class TestContent {

	@Test
	public void testMoney() {
		Money money = new Money(50);
		assertEquals(new Integer(50), money.getVal());
		assertEquals("50", money.toString());
	}
	
	@Test
	public void testText(){
		Text text = new Text("coucou");
		assertEquals("coucou", text.getVal());
		assertEquals("coucou", text.toString());
	}

}
