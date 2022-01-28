import java.util.Scanner;

public class AocDiamond {

	public static void main(String[] args) {

		Scanner diamonds = new Scanner(System.in);

		int Number = diamonds.nextInt();
		if (Number < 10) {

			for (int i = Number; i > 0; i--) {

				for (int d = 0; d < i; d++) {

					System.out.print("  ");

				}
				
				System.out.print("0" + (Number+1 - i));

			
				
				System.out.println("");
			}
			System.out.print("0"+(Number+1));

		}
	}
}
