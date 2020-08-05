package learning;

public class Variable_Declar2 {
	
	public static void main(String[] args)
	{
		int num1 = 14;
		int num2 = 14;
		String FirstName = "Gopinath";
		String Space = " ";
		String LastName = "Dhanasekaran";
		
		int answer1;
		int answer2;
		int answer3;
		String Full_Name;
		boolean answer4;
		
		answer1 = method(num1);
		answer2 = method1(num1, num2);
		answer3 = method3(num1, num2);
		Full_Name = method2(FirstName,Space,  LastName);
		answer4 = method4(num1,num2);
		
		System.out.println("Multiply Local varible with gloable variable: "+ answer1);
		System.out.println("Addtion of two Global Variable: "+answer2);
		System.out.println("Multiplication of two Global Variable: "+answer3);
		System.out.println("Multiplication of two Global Variable: "+Full_Name);
		System.out.println("Num1 is Equal to Num2: "+answer4);
	}
	 

	public static int method(int a)
	{
		int ans = a *11;
		
		return ans;
		
	}
	
	public static int method1(int E1, int F1)
	{
	
		int ans = E1 + F1;
		return ans;
		
	}
	
	public static int method3(int y, int z)
	{
		int mul = y * z;
		
		return mul;
	}
	
	public static String method2(String a, String b, String c)
	{
		String ans = a + b + c;
		return ans;
	}
	
	public static Boolean method4(int s, int d)
	{
		if (s == d)
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
	
}
