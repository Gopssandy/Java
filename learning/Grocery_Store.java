//Owner has Many Grocery stores and Find the profit for apple and orange which got sale on this year

package learning;

public class Grocery_Store {
	// Creating Class variable --> By Creating an object we can utilize this
	// variable throughout this class
	int appleSoldperYear;
	double applePriceperEach;
	int orangeSoldperYear;
	double orangePriceperEach;
	
	
	Grocery_Store(int AppleSold, double ApplePrice, int OrangeSold, double OrangePrice)
	{
		
		appleSoldperYear = AppleSold;
		applePriceperEach = ApplePrice;
		orangeSoldperYear = OrangeSold;
		orangePriceperEach = OrangePrice;
		
	}

	// Main method --> Program starts here
	public static void main(String[] args) {

		// Creating an object

		Grocery_Store Hoston_Store = new Grocery_Store(571,0.99,239,1.23);
		Grocery_Store Orlando_Store = new Grocery_Store(371,1.09,339,0.73);
		Grocery_Store Boston_Store = new Grocery_Store(871,0.79,439,0.98);

		// Creating an Local Variable ---> Created new method and crated one local
	
		 double Revenue_Hoston, Revenue_Boston, Revenue_Orlando ;
		 double Target_Hoston, Target_Boston, Target_Orlando ; 
		 
		// Calling the global Variable using object and initializing the value (Storing
		// the Data)
		 
		 
		 // Commenting this initializing --> instead of this creating constructor and Initializing this object)

		/*
		 * Hoston_Store.appleSoldperYear = 571; Hoston_Store.applePriceperEach = 0.99;
		 * Hoston_Store.orangeSoldperYear = 239; Hoston_Store.orangePriceperEach = 1.23;
		 * 
		 * Orlando_Store.appleSoldperYear = 371; Orlando_Store.applePriceperEach = 1.09;
		 * Orlando_Store.orangeSoldperYear = 339; Orlando_Store.orangePriceperEach = 0.73;
		 * 
		 * Boston_Store.appleSoldperYear = 871; Boston_Store.applePriceperEach = 0.79;
		 * Boston_Store.orangeSoldperYear = 439; Boston_Store.orangePriceperEach = 0.98;
		 */

		// Implementing the calculation using Local variable

		/*
		 * Note: instead of implementing like this individually, we can create separate
		 * method and call this calc please refer "Gross_Revenue" method in this class
		 */

		/*
		 * Revenue_Hoston = (Hoston_Store.appleSoldperYear *
		 * Hoston_Store.applePriceperEach) + (Hoston_Store.orangeSoldperYear *
		 * Hoston_Store.orangePriceperEach);
		 * 
		 * Revenue_Orlando = (Orlando_Store.appleSoldperYear *
		 * Orlando_Store.applePriceperEach) + (Orlando_Store.orangeSoldperYear *
		 * Orlando_Store.orangePriceperEach );
		 * 
		 * Revenue_Boston = (Boston_Store.appleSoldperYear *
		 * Boston_Store.applePriceperEach) + (Boston_Store.orangeSoldperYear *
		 * Boston_Store.orangePriceperEach);
		 */

		// Printing the output in required format

		/*
		 * System.out.println("**********Hoston Store**********\n");
		 * System.out.println("Number of Apple sold per Year :" +
		 * Hoston_Store.appleSoldperYear); System.out.println("Price per Apple :" +
		 * Hoston_Store.applePriceperEach);
		 * System.out.println("Number of Orange sold per Year :" +
		 * Hoston_Store.orangeSoldperYear); System.out.println("Price per Orange :" +
		 * Hoston_Store.orangePriceperEach);
		 * 
		 * System.out.println("\n\n**********Orlando Store**********\n");
		 * System.out.println("Number of Apple sold per Year :" +
		 * Orlando_Store.appleSoldperYear); System.out.println("Price per Apple :" +
		 * Orlando_Store.applePriceperEach);
		 * System.out.println("Number of Orange sold per Year :" +
		 * Orlando_Store.orangeSoldperYear); System.out.println("Price per Orange :" +
		 * Orlando_Store.orangePriceperEach);
		 * 
		 * System.out.println("\n\n**********Boston Store**********\n");
		 * System.out.println("Number of Apple sold per Year :" +
		 * Boston_Store.appleSoldperYear); System.out.println("Price per Apple :" +
		 * Boston_Store.applePriceperEach);
		 * System.out.println("Number of Orange sold per Year :" +
		 * Boston_Store.orangeSoldperYear); System.out.println("Price per Orange :" +
		 * Boston_Store.orangePriceperEach);
		 */
		/*
		 * Note: instead of implementing like this individually, we can create separate
		 * method and call this calc please refer "Gross_Revenue" method in this class
		 */
		/*
		 * System.out.println("\n \t Total Profit of Boston Store : "+"$" +
		 * Revenue_Boston);
		 * System.out.println("\n \t Total Profit of Orlando Store : "+"$" +
		 * Revenue_Orlando);
		 * System.out.println("\n \t Total Profit of Hoston Store : "+"$" +
		 * Revenue_Hoston);
		 */
		 
		 Revenue_Hoston = Hoston_Store.GrossRevenue();
		 Revenue_Boston = Boston_Store.GrossRevenue();
		 Revenue_Orlando = Orlando_Store.GrossRevenue();
	
		 System.out.println("\n\n \t Gross Income of Hoston Store is: $"+ Revenue_Hoston);	
		 System.out.println("\t Gross Income of Boston Store is: $"+ Revenue_Boston);
		 System.out.println("\t Gross Income of Orlando Store is: $"+ Revenue_Orlando);
		 
		 int a = 15000;
		 int b = 20000;
		 Target_Hoston = Hoston_Store.AppleTarget(a);
		 int Rouned_value_Apple = (int) Math.round(Target_Hoston);
		 System.out.println("\n\n This many apple to be sold in Hoston store : "+Rouned_value_Apple + " (to achive the targe of $"+ a+")");
		
		 Target_Hoston = Hoston_Store.OrangeTarget(b);
		 int Rounded_value_Orange = (int) Math.round(Target_Hoston);
		 System.out.println(" This many Orange to be sold in Hoston store : "+Rounded_value_Orange+ " (to achive the targe of $"+ b+")");
		 
		 
		 Target_Boston = Boston_Store.AppleTarget(a);
		 int Rouned_value_Apple1 = (int) Math.round(Target_Boston);
		 System.out.println("\n\n This many apple to be sold in Boston store : "+Rouned_value_Apple1 + " (to achive the targe of $"+ a+")");
		
		 Target_Boston = Hoston_Store.OrangeTarget(b);
		 int Rounded_value_Orange1 = (int) Math.round(Target_Boston);
		 System.out.println(" This many Orange to be sold in Boston store : "+Rounded_value_Orange1+ " (to achive the targe of $"+ b+")");
		 
		 
		 
		 
		 Target_Orlando = Orlando_Store.AppleTarget(a);
		 int Rouned_value_Apple2 = (int) Math.round(Target_Orlando);
		 System.out.println("\n\n This many apple to be sold in Orlando store : "+Rouned_value_Apple2 + " (to achive the targe of $"+ a+")");
		
		 Target_Orlando = Orlando_Store.OrangeTarget(b);
		 int Rounded_value_Orange2 = (int) Math.round(Target_Orlando);
		 System.out.println(" This many Orange to be sold in Orlando store : "+Rounded_value_Orange2+ " (to achive the targe of $"+ b+")");
		 
	}

	// Creating new Method

	 double GrossRevenue() {
		double revenue;

		revenue = (appleSoldperYear * applePriceperEach) + (orangeSoldperYear * orangePriceperEach);

		//System.out.println(" \t \t Total Gross Profit of Boston Store : " + "$" + revenue + "\n");
		
		return revenue;

	}
	 
	 double AppleTarget(double revenue)
	 {
		 return revenue /applePriceperEach;
	 }
	 
	 double OrangeTarget(double revenue)
	 {
		 return revenue / orangePriceperEach;
	 }
}
