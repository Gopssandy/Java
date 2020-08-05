package learning;

public class Child_Class1 extends Abstract_Parent1 {

	@Override
	public void Engine() {
		// TODO Auto-generated method stub
		System.out.println("Engine Capacity is: 10500 cc");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		
		System.out.println("Flight is colored as "+ "Blue color");
		
	}
	
	public static void main(String[] args)
	{
		Child_Class1 Child = new Child_Class1();
		
		Child.Engine();
		
		Child.SaftyGuidelines();
		
		Child.color();
		
		Child.PilotGuidlines();
		
		
	}

}
