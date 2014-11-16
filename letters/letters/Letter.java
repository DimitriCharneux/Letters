package letters.letters;

import letters.Inhabitant;
import letters.content.Content;

/**
 * Class representing a letter.
 * 
 * @author CHARNEUX Dimitri & MOEVI Alexandre
 * 
 * @param <T>
 */
public abstract class Letter<T extends Content> implements Content {

	protected Inhabitant sender;

	protected Inhabitant receiver;

	protected T content;

	/**
	 * constructor of this class
	 * 
	 * @param sender
	 *            sender of the letter
	 * @param receiver
	 *            receiver of the letter
	 * @param content
	 *            content of the letter
	 */
	public Letter(Inhabitant sender, Inhabitant receiver, T content) {
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}

	/**
	 * method returning the sender of the letter
	 * 
	 * @return sender of the letter
	 */
	public Inhabitant getSender() {
		return this.sender;
	}

	/**
	 * method returning the receiver of the letter
	 * 
	 * @return receiver of the letter
	 */
	public Inhabitant getReceiver() {
		return this.receiver;
	}

	/**
	 * method returning the content of the letter
	 * 
	 * @return content of the letter
	 */
	public T getContent() {
		return this.content;
	}

	/**
	 * method to realise the action of the letter
	 */
	public abstract void action();

	/**
	 * method to return the cost of the letter
	 * 
	 * @return cost of the letter
	 */
	public abstract double cout();

	public abstract String toString();
}
