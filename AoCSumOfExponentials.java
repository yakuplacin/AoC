import java.util.Scanner;

public class AoCSumOfExponentials {

	public static void main(String[] args) {

		Scanner exponential = new Scanner(System.in);

		long power = exponential.nextInt();
		long number = exponential.nextInt();
		long total = 0;
		long a = 1;
		/*
		 * First I ask the power and number, then I gave total = 0 to find it, Then I
		 * open a while loop for calculating exponentials. I say a = 1 for multiply each
		 * step. and in the while loop I open a "for" loop for finding exponential.
		 * after that I calculate the total solution. if number is lower than 0, program
		 * finishes.
		 */
		while (number >= 0) {
			if (number < 0)
				break;
			else if (number == 0)
				a = 0;
			else if (number != 0) {
				a = 1;
				for (long i = 1; i <= power; i++) {
					a = a * number;
				}
			}

			number = exponential.nextInt();

			total = total + a;
		}
		System.out.print("" + total);
	}

}
