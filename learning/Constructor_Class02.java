package learning;

public class Constructor_Class02 {
	
	int Gopi;
	String Sanju;
	
	 Constructor_Class02()
	{
		//Gopi = 7;
		System.out.println("Constructor from different class");
	}

	 final void tst()
	 {
		 System.out.println("Final Method implemented");
		 
	 }
	
	public static void main(String[] args)
	{
		Constructor_Class02 Constructor = new Constructor_Class02();
		int a = Constructor.Gopi;
		String b = Constructor.Sanju;
		System.out.println(a);
		System.out.println(b);
	}
}

