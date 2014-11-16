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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractContent other = (AbstractContent) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
	
}
