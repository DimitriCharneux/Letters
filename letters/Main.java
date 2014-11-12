package letters;

import letters.letters.Letter;
import letters.letters.PromissoryNote;
import letters.letters.RegisteredLetter;
import letters.letters.SimpleLetter;
import letters.letters.UrgentLetter;

public class Main {

	public static void main(String[] args) {
		City city = new City();
		int j;
		for (int i = 0; i < 100; i++) {
			Inhabitant inhabitant = new Inhabitant("Inhabitant " + i, city);
			city.add(inhabitant);
		}

		for (j = 0; j < 6; j++) {
			System.out.println("jour " + j);
			for (int k = 0; k < 0; k++) {
				Inhabitant hab = city
						.getInhabitant((int) (Math.random() * 100));
				hab.sendLetter(new SimpleLetter(hab, city
						.getInhabitant((int) (Math.random() * 100)),
						"bonjour M.Roos :)"));
			}
			for (int k = 0; k < 0; k++) {
				Inhabitant hab = city
						.getInhabitant((int) (Math.random() * 100));
				hab.sendLetter(new PromissoryNote(hab, city
						.getInhabitant((int) (Math.random() * 100)), 150));
			}

			for (int k = 0; k < 1; k++) {
				Inhabitant hab = city
						.getInhabitant((int) (Math.random() * 100));
				Inhabitant hab2 = city
						.getInhabitant((int) (Math.random() * 100));
				Letter<?> send = new SimpleLetter(hab, hab2, "vive l'AEL");
				hab.sendLetter(new RegisteredLetter<Letter<?>>(hab, hab2, send));
			}

			for (int l = 0; l < 1; l++) {
				Inhabitant hab = city
						.getInhabitant((int) (Math.random() * 100));
				Inhabitant hab2 = city
						.getInhabitant((int) (Math.random() * 100));
				Letter<?> send = new SimpleLetter(hab, hab2, "vive la COO");
				hab.sendLetter(new UrgentLetter<Letter<?>>(hab, hab2, send));
			}
			city.distributeLetters();
		}

		while (!city.isEmptyLetters()) {
			System.out.println("jour " + j);
			city.distributeLetters();
			j++;
		}
	}
}
