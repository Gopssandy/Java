package learning;

public class String_Class {

	public String MyName() {
		String Name = "Gopinath";
		return Name;
	}

	public String MyPondati() {
		String Name = "Sandy";

		// System.out.println(Name);
		return Name;
	}

	public String MyChellakutty() {
		String Name = "Sanjana";
		return Name;
	}

	public String MyAppuchi() {
		String Name = "Ria";
		return Name;
	}

	public String Respect() {
		String Name = "MADAM";
		return Name;
	}

	public String Language() {
		String Name = "MALAYALAM";
		return Name;
	}

	public static void main(String[] args) {

		// int b;

		String_Class Str = new String_Class();

		/*
		 * String a = Str.MyName(); System.out.println(a); String Mywife =
		 * Str.MyPondati(); System.out.println(Mywife);
		 * 
		 * char A = Mywife.charAt(2); System.out.println(A);
		 * 
		 * int B = Mywife.codePointAt(1);
		 * 
		 * System.out.println(B);
		 */

		String A = Str.MyPondati();
		System.out.println("Her Name is " + A);
		int B = A.length();
		System.out.println("Length of the Name is:" + B);

		for (int i = 0; i < B; i++) {
			char D = A.charAt(i);
			int C = A.codePointAt(i);
			System.out.println(D + "=" + C);
		}

		String My = Str.MyName();
		System.out.println("\n\n\n" + "My Name is :" + My);
		int Le = My.length();
		System.out.println("Length of the Name is:" + Le);

		for (int j = 0; j < Le; j++) {
			char X = My.charAt(j);
			int Y = My.codePointAt(j);
			System.out.println(X + "=" + Y);

		}

		String D1 = Str.MyChellakutty();
		System.out.println("\n\n\n" + "My Name is :" + D1);
		int Le1 = D1.length();
		System.out.println("Length of the Name is:" + Le1);

		for (int S = 0; S < Le1; S++) {
			char E = D1.charAt(S);
			int F = D1.codePointAt(S);
			System.out.println(E + "=" + F);

		}

		String D2 = Str.MyAppuchi();
		System.out.println("\n\n\n" + "My Name is :" + D2);
		int Len2 = D2.length();
		System.out.println("Length of the Name is:" + Len2);

		for (int R = 0; R < Len2; R++) {
			char G = D2.charAt(R);
			int H = D2.codePointAt(R);
			System.out.println(G + "=" + H);

		}

		// Printing Reverse String
		System.out.println("\n");
		System.out.println("\n**********Reverse String*****");
		for (int q = B - 1; q >= 0; q--) {
			System.out.print(A.charAt(q));
		}
		System.out.println("\n");
		for (int r = Le - 1; r >= 0; r--) {
			System.out.print(My.charAt(r));
		}
		System.out.println("\n");
		for (int t = Le1 - 1; t >= 0; t--) {
			System.out.print(D1.charAt(t));
		}
		System.out.println("\n");
		for (int u = Len2 - 1; u >= 0; u--) {
			System.out.print(D2.charAt(u));
		}

		String o = Str.Respect();
		int g = o.length();
		String p1 = "";

		System.out.println("\n");
		System.out.println("***************Check if Palandrome or Not*****************");

		for (int k = g - 1; k >= 0; k--) {
			p1 = p1 + o.charAt(k);
			// System.out.println("Hello");
		}

		if (o.compareTo(o) == p1.compareTo(p1)) {
			System.out.println(p1 + " :is a palandrome");
		}

	}

}
