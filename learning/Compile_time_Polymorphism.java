package learning;

public class Compile_time_Polymorphism {
	
	public void Addition() {
		System.out.println("Addition of two number must be declared");
	}

	
	public void Addition(int a, int b)
	{
		/*
		 * a= 10; b = 20;
		 */
		System.out.println("Value of c is:" +(a+b));
	}
	
	public static void Addition(int a, int b, int D)
	{
		/*
		 * a = 12; b = 13
		 */;
		D= a+b;
		
		System.out.println("Vale of D is:" + D);
	}
	
	public static void main(String[] args)
	{
	Compile_time_Polymorphism  Overloading = new Compile_time_Polymorphism();
		
		int D = 0;

		Addition(12, 13, D);   // we declared Static keyword so no need mention Object.
		
		Overloading.Addition();
		Overloading.Addition(10, 20);
	}
}
