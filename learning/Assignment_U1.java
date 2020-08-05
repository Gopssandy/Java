package learning;

public class Assignment_U1 {
	
	public static void main(String[] agrs)
	{
		int k = 1;
		
		for (int i = 0; i<4;i++)
		{
			
			for (int j = 1; j<=4-i; j++)
			{
				
				System.out.print("\t"+k);
				k++;
			}
			System.out.println("");
		}
		
		int c= 1;
		
		for(int a = 0; a<4; a++)
		{
			
			for (int b = 1; b<=1+a; b++)
				
			{
				System.out.print("\t"+c);
				c++;
			}
			System.out.println("");
		}
		System.out.println("\n\n\n");
		int z = 1;
		
		for(int x = 1; x<=3; x++)
		{
			for (int y = 1; y<=5; y++)
			{
				System.out.print("\t"+z);
				z++;
			}
			
			System.out.println("");
		}
		
		for (int p = 0; p< 4; p++)
		{
			for (int q = 1; q<= 1+p; q++)
			{
				System.out.print("\t"+q);
			}
			System.out.println("");
		}
		
		System.out.println("\n\n\n");
		
		int g = 3;
		
		for(int e = 0; e<3; e++)
		{
			for (int f = 1;f<=1+e; f++ )
			{
				System.out.print("\t"+g);
				g= g+3;
			}
			System.out.println("");
		}
		
		
	}

}

/*
 * 
 * 3
 * 6	9
 * 12	15	18
 * 
 * 
 * 
 * 
 * 12345
 * 56789
 * 1011121314
 * 
 * 
 * 
 * 1
 * 1	2
 * 1	2	3
 * 1	2	3	4
 * 
 * 
 * 
 * 
 * 
 */