package letters.letters;

public class Acknowledgment extends SimpleLetter {

	public Acknowledgment(Letter<?> letter) {
		super(letter.receiver, letter.sender, "Acknowledgment "+ letter.sender.getName());
	}
	
	@Override
	public void action() {}
	
	public String toString() {
		return "an acknowledgment of receipt";
	}
}
