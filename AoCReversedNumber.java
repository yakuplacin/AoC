import java.util.Scanner;

public class AoCReversedNumber {

	public static void main(String[] args) {

		Scanner Reverse = new Scanner(System.in);

		int NormalForm = Reverse.nextInt();
		int FinalForm = 0;

		if (NormalForm == 0)
			System.out.print("" + NormalForm);		
		
		/* I ask the number, if it is 0, it means solution is 0. if it is not zero, then i put a "while" circle.
		 * first I take mod10 of number, and mod10 equals the first digit. after that i subtract digit from first number
		 * and I divide first number by 10 for finding other digit with other loop. for each loop,
		 *  i multiply final form by 10 when i sum each digit in While loop. If final digit of that number is 0, I put number to the other
		 *  circle. while last digit 0 (or last a few) program writes 0. and then calculate the other digits.
		 */
		
		else {
			if (NormalForm%10 != 0)
			{while (NormalForm != 0) {
			
				int digit = NormalForm % 10;
				NormalForm = NormalForm - digit;
				NormalForm = NormalForm / 10;
			
				FinalForm = FinalForm * 10 + digit;
				}
			System.out.print("" + FinalForm);
			}
		 else 
		 {	while (NormalForm %10 == 0)
		 { int digit = NormalForm % 10;
			 System.out.print("0");
				NormalForm = NormalForm - digit;
				NormalForm = NormalForm / 10;	
		 }	
		 while (NormalForm != 0) {
				
				int digit = NormalForm % 10;
				NormalForm = NormalForm - digit;
				NormalForm = NormalForm / 10;
			
				FinalForm = FinalForm * 10 + digit;
		 
		 }
		 System.out.print("" + FinalForm);
		}
		
	}

}}