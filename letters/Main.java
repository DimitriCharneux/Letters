package letters;

import java.util.Random;

import letters.letters.Letter;
import letters.letters.PromissoryNote;
import letters.letters.RegisteredLetter;
import letters.letters.SimpleLetter;
import letters.letters.UrgentLetter;

public class Main {

	private static Random random = new Random();

	private static void randomLetter(City city) {
		Inhabitant sender = city.getInhabitant(random.nextInt(100));
		Inhabitant receiver = city.getInhabitant(random.nextInt(100));
		Letter<?> letter = new SimpleLetter(sender, receiver, "Hello");
		int dice = random.nextInt(6);
		if (dice == 0)
			letter = new SimpleLetter(sender, receiver, "Greetings M. Roos :)");
		if (dice == 1)
			letter = new PromissoryNote(sender, receiver, random.nextInt(1000));
		if (dice == 2)
			letter = new RegisteredLetter<Letter<?>>(sender, receiver, letter);
		if (dice == 3)
			letter = new UrgentLetter<Letter<?>>(sender, receiver, letter);
		if (dice == 4) {
			letter = new PromissoryNote(sender, receiver, random.nextInt(1000));
			letter = new UrgentLetter<Letter<?>>(sender, receiver, letter);
		}
		if (dice == 5) {
			letter = new PromissoryNote(sender, receiver, random.nextInt(1000));
			letter = new RegisteredLetter<Letter<?>>(sender, receiver, letter);
		}
		sender.sendLetter(letter);
	}

	public static void main(String[] args) {
		City city = new City();
		System.out.println("Creating " + city.getName());
		System.out.println("Creating 100 inhabitants");
		for (int i = 0; i < 100; i++) {
			Inhabitant inhabitant = new Inhabitant("Inhabitant-" + i, city);
			city.add(inhabitant);
		}
		System.out.println("Mailing letters for 7 days");
		int days;
		for (days = 1; days <= 7; days++) {
			System.out
					.println("**************************************************");
			System.out.println("day " + days);
			int letters = random.nextInt(10);
			for (int i = 0; i < letters; i++)
				randomLetter(city);
			city.distributeLetters();
		}
		while (!city.isEmptyLetters()) {
			System.out
					.println("**************************************************");
			System.out.println("day " + days++);
			city.distributeLetters();
		}
		System.out.println(days);
	}
}
