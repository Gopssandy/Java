package exception_Handling;

public class Exception_Handling1 {
	
	
	public void divison()
	{
		
		  try { 
			  int a = 5/0; System.out.println(a);
		  
		  }
		  
		  catch(ArithmeticException s) 
		  { 
			  System.out.println(s); // it will print minimum information on the exception
			  
			  System.out.println("\n\n\n");
			  
			  System.out.println("Division result");
			 s.printStackTrace(); /// Using printStackTrace() method --> we can get more details on the exception
			 
			  System.out.println("\n\n\n");
			  
			  System.out.println(s.toString()); // very similar to SYSO 
			  System.out.println(s);
			  
			  System.out.println(s.getMessage());// using this method we will only description of the execption.
		  }
	
	}
	
	
	public void array()
	{
		try 
		{
		int b[] = new int[5];
		b[6] = 12;
		System.out.println(b);
		}
		catch(ArrayIndexOutOfBoundsException Su)
		{
			System.out.println(Su);
		}
		
		System.out.println("Need to learn more Error Handling concept");
	}
	
	
	
	
	public void numberException()
	{
		
		try
		{
			
		String str = "Hello";
	int num = Integer.parseInt(str);
	
	System.out.println(num);
		}
		catch(NumberFormatException NE)
		{
			System.out.println(NE +"I can handle Number format exception also");
		}
			
	}
	
	
	
	public void nullException1()
	{
		try
		{
		String Ten = null;
		@SuppressWarnings("null")
		int length = Ten.length();
		
		System.out.println(length);
		}
		catch(NullPointerException NE1)
		{
			System.out.println(NE1 +"   Null pointer Exception");
		}
		
	}
	
	
	public static void main(String[] args)
	{
	
	Exception_Handling1 EH = new Exception_Handling1();
	
	EH.array();
	EH.divison();
	EH.numberException();
	EH.nullException1();

	
	
	
	}
	
}
