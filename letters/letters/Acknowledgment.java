package letters.letters;

public class Acknowledgment extends SimpleLetter {

	public Acknowledgment(Letter<?> letter) {
		super(letter.receiver, letter.sender, "Acknowledgment "+ letter.sender.getName());
	}
	
	@Override
	public void action() {
		System.out.println("<- "+this.receiver.getName()+" receives an acknowledgment of receipt from "+this.sender.getName());
	}
}
