package learning;

import package_Demo.First_Interface_Demo;

public class Second_Interface_Class implements First_Interface_Demo {

	@Override
	public void Department() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args)
	{
		First_Interface_Demo obj2 = new First_Interface_Demo()
				{

					@Override
					public void Department() {
						// TODO Auto-generated method stub
						
						
					}
			
				};
				
				obj2.Department();
				obj2.transportation();
	}
}
