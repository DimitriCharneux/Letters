package letters.letters;

import letters.Inhabitant;

/**
 * Class representing a urgent letter, she content another letter and this price
 * is double.
 * 
 * @author CHARNEUX Dimitri & MOEVI Alexandre
 * 
 * @param <T>
 */
public class UrgentLetter<T extends Letter<?>> extends DecoratorLetter<T> {

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
	public UrgentLetter(Inhabitant sender, Inhabitant receiver, T content) {
		super(sender, receiver, content);
	}

	@Override
	public void action() {
		this.content.action();
	}

	@Override
	public int cout() {
		return 2 * this.content.cout();
	}

	@Override
	public String toString() {
		return "an urgent letter whose content is " + this.content;
	}

}
