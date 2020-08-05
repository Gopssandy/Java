package learning;

import package_Demo.Abstract_parent2;

public class Child_Class2 extends Abstract_parent2 {

	@Override
	public void Gopi() {
		// TODO Auto-generated method stub
		System.out.println("My Name is Gopi");
	}

	@Override
	public void Engine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args)
	{
		Child_Class2 child2 = new Child_Class2();
		Child_Class1 Child1 = new Child_Class1();
		
		child2.Method1();
		Child1.Engine();
		child2.Gopi();
		child2.PilotGuidlines();
		child2.SaftyGuidelines();
		Child1.color();
	}
	

}
