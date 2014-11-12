package letters.letters;

import letters.Inhabitant;

public class RegisteredLetter<T extends Letter<?>> extends DecoratorLetter<T> {

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
		return "a registered letter whose content is "+this.content;
	}

}
