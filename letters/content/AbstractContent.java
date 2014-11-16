package letters.content;

/**
 * Class representing a content of a letter.
 * 
 * @author CHARNEUX Dimitri & MOEVI Alexandre
 *
 * @param <T>
 */
public abstract class AbstractContent<T> implements Content {
	protected T value;
	
	/**
	 * method for know the values of the Content
	 * 
	 * @return values of the Content
	 */
	public  T getVal(){
		return value;
	}
	public abstract String toString();
}
