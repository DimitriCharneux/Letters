package letters.letters;

import letters.Inhabitant;
import letters.content.Text;

public class SimpleLetter extends Letter<Text> {
	
	protected static final double cost = 1;

	public SimpleLetter(Inhabitant sender, Inhabitant receiver, String content) {
		super(sender, receiver, new Text(content));
	}

	@Override
	public void action() {}

	@Override
	public double cout() {
		return cost;
	}

	@Override
	public String toString() {
		return "a simple letter whose content is a text content ("+this.content.getVal()+")";
	}

}
