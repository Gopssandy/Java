package learning;

public class Constructors_Class01 extends Constructor_Class02  {
	
	
	int EID;
	String EName;
	String EStatus;
	boolean Car;
	
	Constructors_Class01(int w, String x, String y, boolean z)
	{
		super();		// Calling Constructor from different class
		EID = w ;
		EName = x;
		EStatus = y;
		Car = z;
		System.out.println("Parameterized Constructor");
		
		
		
		
	}
	Constructors_Class01(String v)
	{
		System.out.println("I am the third constructor");
	}
	Constructors_Class01()
	{
		this(5,"Gopinath Dhanasekaran","Not Active",true); 	// Calling constructor from same class
		//this("Hello");
		System.out.println("default Constructor");
	}
	
	
	public static void main(String[] args)
	{
		//Constructors_Class01 Emp = new Constructors_Class01(32703,"Gopinath Dhanasekaran","Not Active",true);
		Constructors_Class01 Emp1 = new Constructors_Class01();
		
		Constructor_Class02 SecondClass = new Constructor_Class02();
		
		
		SecondClass.tst();
		
		  boolean a = Emp1.Car; int b = Emp1.EID; String c = Emp1.EName; String d =
		  Emp1.EStatus;
		 
		
		System.out.println("\n");
		System.out.println(Emp1);
		System.out.println("\n");
		
		
		
		  System.out.println(a); System.out.println(b); System.out.println(c);
		  System.out.println(d);
		 
		
		
	}

}
