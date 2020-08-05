package exception_Handling;

public class Try_Catch_Finally_NestedTRY {

	public void AE2() {

		try {
			System.out.println("Statement 1");
			try {
				int a[] = new int[4];
				a[3] = 6;
				System.out.println(a);
				System.out.println("First inner try");

				try {
					System.out.println(10 / 0 );
				} catch (NullPointerException e) {
					System.out.println("its Inner to inner try block");
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

			System.out.println("Statement 3");
			System.out.println("Statement 4");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("Finally block");
		}
		
		System.out.println("outside try, Catch and Finally block");
	}

	public static void main(String[] args) {
		Try_Catch_Finally_NestedTRY obj10 = new Try_Catch_Finally_NestedTRY();

		obj10.AE2();
	}

}
