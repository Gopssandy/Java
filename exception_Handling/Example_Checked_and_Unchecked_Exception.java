package exception_Handling;

import java.io.*;

public class Example_Checked_and_Unchecked_Exception {
	
	public static void main(String[] arg) throws FileNotFoundException // throws FileNotFoundException Checked Exception
	{
		PrintWriter PW = new PrintWriter("abc.txt");
		PW.println("Hello");
		System.out.println(PW);
		
		System.out.println(10/1);
	}

}