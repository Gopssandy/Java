package learning;

import package_Demo.First_Interface_Demo;
import package_Demo.Second_Interface_Demo;

public class College_Interface_Call implements First_Interface_Demo, Second_Interface_Demo {

	@Override
	public void Department() {
		// TODO Auto-generated method stub
		
		System.out.println("My department is Computer Science");
		
		if (5>3)
		{
			System.out.println("we can learn Java very easily");
		}
		
	}
	
	@Override
	public void Playground() {
		System.out.println("we have around 10 playground in our University");
		
	}

	@Override
	public void auditoriams() {
		System.out.println("we have 12 auditoriums in our university");
		
	}
	
	public static void main(String[] args)
	{
		College_Interface_Call obj1 = new College_Interface_Call();
		
		obj1.Department();
		obj1.Playground();
		obj1.auditoriams();
		obj1.transportation();
		System.out.println("Thanks for the oppurtinaty");
				
	}

	
	

}
