package letters.content;

/**
 * Class representing a money to send with a promissory note.
 * 
 * @author CHARNEUX Dimitri & MOEVI Alexandre
 * 
 */
public class Money extends AbstractContent<Integer> {


	/**
	 * constructor of this class
	 * 
	 * @param content
	 */
	public Money(Integer content) {
		this.value = content;
	}

	@Override
	public String toString() {
		return this.value.toString();
	}
}
