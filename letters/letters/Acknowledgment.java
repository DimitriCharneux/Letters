package letters.letters;

/**
 * Class representing a letter of acknowledgment of receipt.
 * 
 * @author CHARNEUX Dimitri & MOEVI Alexandre
 * 
 */
public class Acknowledgment extends SimpleLetter {

	/**
	 * constructor of this class
	 * 
	 * @param letter
	 */
	public Acknowledgment(Letter<?> letter) {
		super(letter.receiver, letter.sender, "Acknowledgment "+ letter.sender.getName());
	}
	
	@Override
	public void action() {}
	
	public String toString() {
		return "an acknowledgment of receipt";
	}
}
