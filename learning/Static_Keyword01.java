package learning;

public class Static_Keyword01 {

	int EmpID;
	String EmpName;
	static String EmpCompany;
	
	public void Employee(int a, String b, String c)
	{
		printHeadings();
		EmpID = a;
		EmpName = b;
		EmpCompany = c;
		printDetails();
	}
	
	public void printHeadings()
	{
		//System.out.println("Below are the Employee Details :-");
	}
	public void printDetails()
	{
		
		System.out.println("\n");
		
		System.out.println("Employee_ID"+"  "+"Employee_name"+"  "+"\t\t"+"Company");
		System.out.println(EmpID+"        "+EmpName+"         "+EmpCompany);
	}
	
	public static void main(String[] args)
	{
		Static_Keyword01 empDetails = new Static_Keyword01();
		Static_Keyword01 empDetails1 = new Static_Keyword01();
		
		empDetails.Employee(32703, "Gopinath Dhanasekaran", "Atos");
		
		empDetails1.Employee(32688, "Sandhya Udayasankar", "Atos Syntel");
		
		
		
	}

}
