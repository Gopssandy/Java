package learning;

public class Runtime_Polymorphism_Child extends Runtime_Polymorphism_Parent {
	
	public void Animal()
	{
		System.out.println("Animal can eat");
	}
	
	
	
	  public void Human() { System.out.println("Like Human can eat"); }
	 
	
	public static void main(String args[])
	{
		Runtime_Polymorphism_Parent eat = new Runtime_Polymorphism_Parent();
		Runtime_Polymorphism_Child have = new Runtime_Polymorphism_Child();
		Runtime_Polymorphism_Parent UpCasting1 = new Runtime_Polymorphism_Child(); 		//// Up Casting
		
	//	 Runtime_Polymorphism_Child Obj1 = new Runtime_Polymorphism_Parent(); ------> Invalid scenario we cann't make child class as reference to parent
		
		
		
		eat.Human();
		have.Animal();
		UpCasting1.Human();  // Note: if child class don't have method Human then it will go and print from parent class.
		//Runtime_Polymorphism_Child.Human(UpCasting1); ---> Tried to downcast (but not working)
				
	}

}
