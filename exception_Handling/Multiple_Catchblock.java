package exception_Handling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Multiple_Catchblock {

	public void ArrayE()
	{
		try
		{
		int a[] = new int[4];
		a[5] = 6;
		System.out.println(a);
		}
	
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}

		
	}
	
	
	public void DivisionE()
	{
		try
		{
		int A = 10;
		int B = 0;
	
		int c = A/B;
		System.out.println(c);}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		
	}
	
	public void FileE() throws FileNotFoundException
	{
		@SuppressWarnings("resource")
		PrintWriter PW = new PrintWriter("Abc.txt");
		PW.println("Hello");
		
	}
	
	public static void main(String[] args)
	{
		Multiple_Catchblock Mcatch = new Multiple_Catchblock();
		
		
		Mcatch.ArrayE();
		
	}
	
	

}
