package letters.letters;

import letters.Inhabitant;

/**
 * Class representing a letter with acknowledgment of receipt.
 * 
 * @author CHARNEUX Dimitri & MOEVI Alexandre
 * 
 * @param <T>
 *            Letter or Letter extends
 */
public class RegisteredLetter<T extends Letter<?>> extends DecoratorLetter<T> {

	/**
	 * constructor of this class
	 * 
	 * @param sender
	 *            sender of the letter
	 * @param receiver
	 *            receiver of the letter
	 * @param content
	 *            Letter or Letter extends
	 */
	public RegisteredLetter(Inhabitant sender, Inhabitant receiver, T content) {
		super(sender, receiver, content);
	}

	@Override
	public void action() {
		this.content.action();
		this.receiver.sendLetter(new Acknowledgment(this.content));
	}

	@Override
	public double cout() {
		return 15 + this.content.cout();
	}

	@Override
	public String toString() {
		return "a registered letter whose content is " + this.content;
	}

}
