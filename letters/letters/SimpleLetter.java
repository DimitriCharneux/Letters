package letters.letters;

import letters.Inhabitant;
import letters.content.Text;

/**
 * Class representing a letter content a text.
 * 
 * @author CHARNEUX Dimitri & MOEVI Alexandre
 * 
 */
public class SimpleLetter extends Letter<Text> {

	protected static final double cost = 1;

	/**
	 * constructor of this class
	 * 
	 * @param sender
	 *            sender of the letter
	 * @param receiver
	 *            receiver of the letter
	 * @param content
	 *            text in the letter
	 */
	public SimpleLetter(Inhabitant sender, Inhabitant receiver, String content) {
		super(sender, receiver, new Text(content));
	}

	@Override
	public void action() {
	}

	@Override
	public double cout() {
		return cost;
	}

	@Override
	public String toString() {
		return "a simple letter whose content is a text content ("
				+ this.content.getVal() + ")";
	}

}
