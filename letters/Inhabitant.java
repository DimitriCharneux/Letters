package letters;

import letters.letters.Letter;

/**
 * Class representing a inhabitant
 * 
 * @author CHARNEUX Dimitri & MOEVI Alexandre
 * 
 */
public class Inhabitant {

	private String name;

	private City city;

	private double bankAccount;

	/**
	 * constructor of this class
	 * 
	 * @param name
	 *            name of the inhabitant
	 * @param city
	 *            city of the inhabitant
	 */
	public Inhabitant(String name, City city) {
		this.name = name;
		this.city = city;
		this.bankAccount = 0;
	}

	/**
	 * method to send a letter in the postbox of the city
	 * 
	 * @param letter
	 *            letter to send
	 */
	public void sendLetter(Letter<?> letter) {
		System.out.println("-> " + letter.getSender().getName() + " mails to "
				+ letter.getReceiver().getName() + " for " + letter.cout()
				+ " euros.");
		this.debit(letter.cout());
		this.city.sendLetter(letter);
	}

	/**
	 * method to receive a letter
	 * 
	 * @param letter
	 */
	public void receiveLetter(Letter<?> letter) {
		letter.action();
		System.out.println("<- " + letter.getReceiver().getName()
				+ " receives " + letter.toString() + " from "
				+ letter.getSender().getName());
	}

	/**
	 * method to remove a amount of the inhabitant's bank account
	 * 
	 * @param amount
	 */
	public void debit(double amount) {
		this.bankAccount = this.bankAccount - amount;
		System.out
				.println("  - " + amount + " euro(s) are deducted from "
						+ this.name + " balance is now " + this.bankAccount
						+ " euros.");
	}

	/**
	 * method to add a amount of the inhabitant's bank account
	 * 
	 * @param amount
	 */
	public void credit(double amount) {
		this.bankAccount = this.bankAccount + amount;
		System.out.println("  + " + this.name + " account is credited with "
				+ amount + " euro(s); its balance is now " + this.bankAccount
				+ " euros");
	}

	/**
	 * method to know the inhabitant's name
	 * 
	 * @return the inhabitant's name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * method for know the amount in the inhabitant's bank account
	 * 
	 * @return
	 */
	public double getAmount() {
		return this.bankAccount;
	}
}
