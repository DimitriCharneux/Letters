package letters.content;

/**
 * Class representing a money to send with a promissory note.
 * 
 * @author CHARNEUX Dimitri & MOEVI Alexandre
 * 
 */
public class Money implements Content {

	private double val;

	/**
	 * constructor of this class
	 * 
	 * @param content
	 */
	public Money(double content) {
		this.val = content;
	}

	/**
	 * method for know the values of the money
	 * 
	 * @return values of the money
	 */
	public double getVal() {
		return this.val;
	}
}
