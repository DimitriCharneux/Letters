package letters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import letters.letters.Letter;

/**
 * Class representing a city with these inhabitants and its postbox.
 * 
 * @author CHARNEUX Dimitri & MOEVI Alexandre
 * 
 */
public class City {

	private List<Letter<?>> letters;

	private String name;

	private List<Inhabitant> inhabitants;

	/**
	 * Constructor of class.
	 */
	public City() {
		this.letters = new ArrayList<Letter<?>>();
		this.name = "Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch city";
		this.inhabitants = new ArrayList<Inhabitant>();
	}

	/**
	 * Constructor of class.
	 * 
	 * @param name
	 *            - name of the city
	 */
	public City(String name) {
		this.letters = new ArrayList<Letter<?>>();
		this.name = name;
		this.inhabitants = new ArrayList<Inhabitant>();
	}

	/**
	 * Send all the letters in the postbox.
	 */
	public void distributeLetters() {
		List<Letter<?>> lettersoftheday = this.letters;
		this.letters = new ArrayList<Letter<?>>();
		Iterator<Letter<?>> it = lettersoftheday.iterator();
		while (it.hasNext()) {
			Letter<?> letter = it.next();
			letter.getReceiver().receiveLetter(letter);
		}
	}

	/**
	 * add a inhabitant to the city
	 * 
	 * @param inhabitant
	 */
	public void add(Inhabitant inhabitant) {
		this.inhabitants.add(inhabitant);
	}

	/**
	 * add a letter to a postbox of the city
	 * 
	 * @param letter
	 */
	public void sendLetter(Letter<?> letter) {
		this.letters.add(letter);
	}

	/**
	 * return inhabitant number i
	 * 
	 * @param i
	 *            number of the inhabitant
	 * @return the inhabitant
	 */
	public Inhabitant getInhabitant(int i) {
		return this.inhabitants.get(i);
	}

	/**
	 * return the name of the city
	 * 
	 * @return name of the city
	 */
	public String getName() {
		return name;
	}

	/**
	 * method to know if the postbox is empty
	 * 
	 * @return true if the postbox is empty, false else
	 */
	public boolean isEmptyLetters() {
		return this.letters.isEmpty();
	}

}
