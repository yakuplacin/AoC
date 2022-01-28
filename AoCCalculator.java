import java.util.Scanner;

public class AoCCalculator {

	public static void main(String[] args) {

		Scanner Calculate = new Scanner(System.in);

		int FirstNumber = Calculate.nextInt();
		String symbol = Calculate.next();
		int SecondNumber = Calculate.nextInt();
/*First I ask numbers and symbol, And i put some cases. Symbol is appropriate in which statement, then calculator calculate that position. 
 * I write symbols and formulas for each if/else statement
 */
		int total = 0, multip = 1;

		if (symbol.equals("+")) {
			total = FirstNumber + SecondNumber;
			System.out.print("" + total);
		}

		else if (symbol.equals("-")) {
			total = FirstNumber - SecondNumber;
			System.out.print("" + total);
		}

		else if (symbol.equals("*")) {
			multip = FirstNumber * SecondNumber;

			System.out.print("" + multip);
		}

		else if (symbol.equals("/")) {
			double divide = 1;
			 divide = (double)FirstNumber / (double)SecondNumber;

			System.out.printf("%.3f", (double)divide);
		}

	}

}
