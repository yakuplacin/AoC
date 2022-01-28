import java.util.Scanner;

public class AoCPositivityIkinciSayfa {

	public static void main(String[] args) {

		Scanner variables = new Scanner(System.in);

		long Pnumber = variables.nextInt();
		long total = 0;
		while (Pnumber != 0) { 
			/* until a number equals zero, I calculate all positive number. First I ask number, then set total = 0
			 * for each while loop steps, I ask new number and if it is positive I add it to total solution 
			 */
			
			if (Pnumber > 0)
				total = total + Pnumber;

			long other = variables.nextInt();

			Pnumber = other;
		}
		System.out.print("" + total);

	}

}
