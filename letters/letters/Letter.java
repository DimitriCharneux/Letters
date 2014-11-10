package letters.letters;

import letters.Inhabitant;
import letters.content.Content;

public abstract class Letter<T extends Content> {
	
	protected Inhabitant sender;
	
	protected Inhabitant receiver;
	
	protected T content;
	
	public Letter(Inhabitant sender, Inhabitant receiver, T content) {
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}
	
	public Inhabitant getSender() {
		return this.sender;
	}
	
	public Inhabitant getReceiver() {
		return this.receiver;
	}
	
	public T getContent() {
		return this.content;
	}
	
	public abstract void action();
	
	public abstract double cout();

}
