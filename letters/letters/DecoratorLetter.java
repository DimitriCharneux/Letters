package letters.letters;

import letters.Inhabitant;

/**
 * Class representing a letter content another letter.
 * 
 * @author CHARNEUX Dimitri & MOEVI Alexandre
 * 
 * @param <T>
 */
public abstract class DecoratorLetter<T extends Letter<?>> extends Letter<T> {

	/**
	 * constructor of this class
	 * 
	 * @param sender
	 *            sender of the letter
	 * @param receiver
	 *            receiver of the letter
	 * @param content
	 *            letter in a decorator letter
	 */
	public DecoratorLetter(Inhabitant sender, Inhabitant receiver, T content) {
		super(sender, receiver, content);
	}

}
