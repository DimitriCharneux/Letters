package letters.letters;

import letters.Inhabitant;
import letters.content.Money;

/**
 * Class representing a letter content money.
 * 
 * @author CHARNEUX Dimitri & MOEVI Alexandre
 * 
 */
public class PromissoryNote extends Letter<Money> {

	/**
	 * constructor of this class
	 * 
	 * @param sender
	 *            sender of the letter
	 * @param receiver
	 *            receiver of the letter
	 * @param content
	 *            money in the letter
	 */
	public PromissoryNote(Inhabitant sender, Inhabitant receiver, Integer content) {
		super(sender, receiver, new Money(content));
	}

	@Override
	public void action() {
		this.sender.debit(this.content.getVal());
		this.receiver.credit(this.content.getVal());
		this.receiver.sendLetter(new Thanks(this));
	}

	@Override
	public int cout() {
		return (int)(1 + 0.1 * this.content.getVal());
	}

	@Override
	public String toString() {
		return "a promissory note letter whose content is a money content ("
				+ this.content.getVal() + ")";
	}

}
