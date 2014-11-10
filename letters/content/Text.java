package letters.content;


public class Text implements Content {

	private String val;
	
	public Text(String text) {
		this.val = text;
	}
	
	public String getVal() {
		return this.val;
	}
}
