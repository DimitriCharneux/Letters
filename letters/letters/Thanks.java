package letters.letters;

public class Thanks extends SimpleLetter {

	public Thanks(PromissoryNote letter) {
		super(letter.receiver, letter.sender, "Thank you "+ letter.sender.getName());
	}
	
	@Override
	public void action() {
		System.out.println("<- "+this.receiver.getName()+" receives a thanks letter whose content is a text content ("+this.content.getVal()+") from "+this.sender.getName());
	}

}
