package learning;

public class child extends parent {
	
	int b = 20;
	
	void show()
	{
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		
		child obj = new child();
		
		System.out.println("value of parent class is "+obj.a);
		
		

	}

}
