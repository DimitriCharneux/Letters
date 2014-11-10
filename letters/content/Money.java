package letters.content;

public class Money implements Content {

	private double val;
	
	public Money(double content) {
		this.val = content;
	}
	
	public double getVal() {
		return this.val;
	}
}
