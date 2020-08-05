package exception_Handling;

public class Throw_02 {
	
	public static void main(String[] args)
	{
		try
		{
		throw new ArithmeticException ("Divided by Zero");  // This exception will be raised in compile time.
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Gopi");
	}
}
