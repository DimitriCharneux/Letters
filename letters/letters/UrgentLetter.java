package letters.letters;

import letters.Inhabitant;

public class UrgentLetter<T extends Letter<?>> extends DecoratorLetter<T> {
	
	public UrgentLetter(Inhabitant sender, Inhabitant receiver, T content) {
		super(sender, receiver, content);
	}

	@Override
	public void action() {
		System.out
		.println("<- "
				+ this.receiver.getName()
				+ " receives an Urgent Letter whose content is "+this.content +" from "
				+ this.sender.getName());
this.content.action();
		
	}

	@Override
	public double cout() {
		return 2 * this.content.cout();
	}

	@Override
	public String toString() {
		return "urgent letter";
	}

}
