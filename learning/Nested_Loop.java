package learning;

public class Nested_Loop {
	
	 int  i= 0;
	 int j= 0;
	
	public static void main(String agrs[])
	{
	
	//	Nested_Loop obj = new Nested_Loop();
		/*
		 * int j = obj.j;
		 * 
		 * int i = obj.i;
		 */
		
		int i = 0;
		int j = 0;
		
		for(i= 1; i<=5;i++)
		{
			//System.out.println("Outer loop No: "+i);
			
			System.out.println(i);
			
			for( j=1;j<3;j++)
			{
				System.out.println("Inner loop No: "+j);
			}
		}
	
		System.out.println( i);
		System.out.println(j);
	}

}
