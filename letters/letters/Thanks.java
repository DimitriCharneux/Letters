package letters.letters;

/**
 * Class representing a letter of thanks for a promissory note.
 * 
 * @author CHARNEUX Dimitri & MOEVI Alexandre
 * 
 */
public class Thanks extends SimpleLetter {

	/**
	 * constructor of this class
	 * 
	 * @param letter
	 *            promissory note receiving
	 */
	public Thanks(PromissoryNote letter) {
		super(letter.receiver, letter.sender, "Thank you "
				+ letter.sender.getName());
	}

	@Override
	public void action() {
	}

	public String toString() {
		return "a thanks letter whose content is a text content ("
				+ this.content.getVal() + ")";
	}
}
