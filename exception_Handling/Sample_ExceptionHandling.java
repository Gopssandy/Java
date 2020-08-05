package exception_Handling;

import java.util.*;

public class Sample_ExceptionHandling {
	
	public static void main(String[] args)
	{
		
		try {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
				
		
		System.out.println(("Enter the Num 1"));
		int N1 = obj.nextInt();
		
		System.out.println("Enter the Num 2");
		int N2 = obj.nextInt();
		
		double Sum = N1 / N2;
		
		System.out.println(Sum);}
		catch(Exception e)
		{
			System.out.println("There is some issue with the logic, Please fix the Logic"+ "\n"+ "Following is the error: "+ e	);
		}
		
		
	}

}
