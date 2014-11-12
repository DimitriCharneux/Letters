package letters.letters;

import letters.Inhabitant;
import letters.content.Money;

public class PromissoryNote extends Letter<Money>{

	public PromissoryNote(Inhabitant sender, Inhabitant receiver, double content) {
		super(sender, receiver, new Money(content));
	}

	@Override
	public void action() {
		System.out.println("<- "+this.receiver.getName()+" receives a promissory note letter whose content is a money content ("+this.content.getVal()+") from "+this.sender.getName());
		this.sender.debit(this.content.getVal());
		this.receiver.credit(this.content.getVal());
		this.receiver.sendLetter(new Thanks(this));
	}

	@Override
	public double cout() {
		return (1 + 0.1 * this.content.getVal());
	}

	@Override
	public String toString() {
		return "promissory note";
	}
	
	

}
