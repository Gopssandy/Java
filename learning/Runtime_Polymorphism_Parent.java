package learning;

public class Runtime_Polymorphism_Parent {
	
	
	  public void Human() { System.out.println("Human can eat"); }
	 
	
	private void Gender(){
		
		System.out.println("There are three kind of Gender available");
		
	}
	
	public static void main(String[] args)
	{
		
		Runtime_Polymorphism_Parent obj4 = new Runtime_Polymorphism_Parent();
		
		obj4.Gender();
	
	}

}
