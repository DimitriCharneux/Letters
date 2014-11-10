package letters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import letters.letters.*;

public class City {

	private List<Letter<?>> letters;
	
	private String name;
	
	private List<Inhabitant> inhabitants;
	
	public City() {
		this.letters = new ArrayList<Letter<?>>();
		this.name = "Cincinnati";
		this.inhabitants = new ArrayList<Inhabitant>();
	}
	
	public City(String name) {
		this.letters = new ArrayList<Letter<?>>();
		this.name = name;
		this.inhabitants = new ArrayList<Inhabitant>();
	}

	public void distributeLetters() {
		List<Letter<?>> lettersoftheday = this.letters;
		this.letters = new ArrayList<Letter<?>>();
		Iterator<Letter<?>> it = lettersoftheday.iterator();
		while(it.hasNext()) {
			Letter<?> letter = it.next();
			letter.getReceiver().receiveLetter(letter);
		}
	}
	
	public void add(Inhabitant inhabitant) {
		this.inhabitants.add(inhabitant);
	}
	
	public void sendLetter(Letter<?> letter) {
		this.letters.add(letter);
	}
	
	public static void main(String[] args) {
		City city = new City();
		Inhabitant smith = new Inhabitant("Mr. Smith", city);
		Inhabitant bradford = new Inhabitant("Mr. Bradford", city);
		Letter<?> letter1 = new PromissoryNote(smith,bradford,100);
		Letter<?> letter2 = new SimpleLetter(smith,bradford,"Bonjour");
		city.add(smith);
		city.add(bradford);
		System.out.println("City of "+city.name);
		smith.sendLetter(letter1);
		smith.sendLetter(letter2);
		city.distributeLetters();
		System.out.println(smith.getAmount());
		System.out.println(bradford.getAmount());
		city.distributeLetters();
	}
}
