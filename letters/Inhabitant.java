package letters;

import letters.letters.Letter;

public class Inhabitant {

	private String name;
	
	private City city;
	
	private double bankAccount;
	
	public Inhabitant(String name, City city) {
		this.name = name;
		this.city = city;
		this.bankAccount = 0;
	}
	
	public void sendLetter(Letter<?> letter) {
		System.out.println("-> "+letter.getSender().getName()+" mails to "+letter.getReceiver().getName()+" for "+letter.cout()+" euros.");
		this.debit(letter.cout());
		this.city.sendLetter(letter);
	}
	
	public void receiveLetter(Letter<?> letter) {
		letter.action();
	}
	
	public void debit(double amount) {
		this.bankAccount = this.bankAccount - amount;
		System.out.println("  - "+amount+" are deducted from "+this.name+" balance is now "+this.bankAccount+" euros.");
	}
	
	public void credit(double amount) {
		this.bankAccount = this.bankAccount + amount;
		System.out.println("  + "+this.name+" account is credited with "+amount+" euros; its balance is now "+this.bankAccount+" euros");
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getAmount() {
		return this.bankAccount;
	}
}
