package learning;

public class Nested_if 
{
	
	int A = 10;
	static int B = 20;
	
	public static void main(String args[]){
		int C = 30;
		
		Nested_if obj = new Nested_if();
		
		if (obj.A < B){
			System.out.println("First condition is Pass");
			
			if (B == C)
			{
				System.out.println("Second condition is pass");
			}
			
		 }
	 }
	
 }

