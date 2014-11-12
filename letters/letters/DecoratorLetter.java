package letters.letters;

import letters.Inhabitant;

public abstract class DecoratorLetter<T extends Letter<?>> extends Letter<T>{

	public DecoratorLetter(Inhabitant sender, Inhabitant receiver,
			T content) {
		super(sender, receiver, content);
	}

}
