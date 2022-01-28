import java.util.Scanner;

public class AocIndexFinder {

	public static void main(String[] args) {

		Scanner CapitalL = new Scanner(System.in);
/*
 * First I ask the Letter. And I gave a number for each Latter. When user gives a (with capital) Latter, program says which number Latter has  
 */
		String Lett = CapitalL.next();
		int Number = 0;
		if (Lett.equals("A"))
			Number = 1;
		else if (Lett.equals("B"))
			Number = 2;

		else if (Lett.equals("C"))
			Number = 3;

		else if (Lett.equals("D"))
			Number = 4;

		else if (Lett.equals("E"))
			Number = 5;

		else if (Lett.equals("F"))
			Number = 6;

		else if (Lett.equals("G"))
			Number = 7;

		else if (Lett.equals("H"))
			Number = 8;

		else if (Lett.equals("I"))
			Number = 9;

		else if (Lett.equals("J"))
			Number = 10;

		else if (Lett.equals("K"))
			Number = 11;

		else if (Lett.equals("L"))
			Number = 12;

		else if (Lett.equals("M"))
			Number = 13;

		else if (Lett.equals("N"))
			Number = 14;

		else if (Lett.equals("O"))
			Number = 15;

		else if (Lett.equals("P"))
			Number = 16;

		else if (Lett.equals("Q"))
			Number = 17;

		else if (Lett.equals("R"))
			Number = 18;

		else if (Lett.equals("S"))
			Number = 19;

		else if (Lett.equals("T"))
			Number = 20;

		else if (Lett.equals("U"))
			Number = 21;

		else if (Lett.equals("V"))
			Number = 22;

		else if (Lett.equals("W"))
			Number = 23;
		
		else if (Lett.equals("X"))
			Number = 24;
		
		else if (Lett.equals("Y"))
			Number = 25;
		
		else if (Lett.equals("Z"))
			Number = 26;
System.out.print(""+ Number);
	}
		
}
