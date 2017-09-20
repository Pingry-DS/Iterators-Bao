import java.util.Iterator;
import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;

public class FibonacciIterator implements Iterator<Integer>
{
	private int n = 1;
	private int before = 0;
	private int first = 0;
	
	public Integer next()
	{
		if(first == 0)
		{
			first++;
			return first;
		}
		
		if(hasNext())
		{
			int temp = n;
			n += before;
			before = temp;
			return n;
		}
		throw new NoSuchElementException("Squares only up to 233.");
	}
	
	public boolean hasNext()
	{
		return n < 145;
	}
	
	public void remove()
	{
		throw new UnsupportedOperationException("Squares cannot be removed.");
	}
}

