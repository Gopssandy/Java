package learning;

public class Variable_Declar {

	public static void main(String[] args)
	{
		Variable_Declar car = new Variable_Declar();
		
		System.out.println(car.Toyota());
		
	}
	
	
	public boolean Toyota()
	{
		String Make = "Toyota";
		String Model = "Highlander";
		int MFY = 2019;
		String colour = "Black";
		int High_Speed = 240;
		
		
		System.out.println("Make of the Vechile :"+Make);
		System.out.println("Model of the Vechile :"+Model);
		System.out.println("Manufracture Year :"+MFY);
		System.out.println("Color of the Vechile :"+colour);
		System.out.println("Recorded High Speed :"+High_Speed);
		return false;
	}
	
}
