package letters.content;

/**
 * Class representing a Text of a simple letter.
 * 
 * @author CHARNEUX Dimitri & MOEVI Alexandre
 * 
 */
public class Text implements Content {

	private String val;

	/**
	 * constructor of this class
	 * 
	 * @param text
	 */
	public Text(String text) {
		this.val = text;
	}

	/**
	 * method returning the text
	 * 
	 * @return the text
	 */
	public String getVal() {
		return this.val;
	}

	public String toString() {
		return this.val;
	}
}
