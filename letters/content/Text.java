package letters.content;

/**
 * Class representing a Text of a simple letter.
 * 
 * @author CHARNEUX Dimitri & MOEVI Alexandre
 * 
 */
public class Text extends AbstractContent<String> {


	/**
	 * constructor of this class
	 * 
	 * @param text
	 */
	public Text(String text) {
		this.value = text;
	}

	public String toString() {
		return this.value;
	}
}
