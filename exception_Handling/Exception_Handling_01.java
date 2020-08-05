package exception_Handling;

public class Exception_Handling_01 {
	
	public void Do()
	{
		System.out.println("Do step");
		Domore();
		System.out.println(10/0);
	}
	
	public void Domore()
	{
		System.out.println("Domore step");
		Doless();
	}
	
	public void Doless()
	{
		System.out.println("Doless step");
	}

	
public static void main(String[] args)
{
	Exception_Handling_01 obj3 = new Exception_Handling_01();
	
	obj3.Do();
}

}
