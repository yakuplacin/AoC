import java.util.Scanner;

public class AoCNumberofOneS {

	public static void main(String[] args) {

		Scanner OnceOne = new Scanner(System.in);
		int Number = OnceOne.nextInt();
		int count =0;
		/*First, I ask the number. Then I open a while loop. when number is not zero, it continues.
		 * I take the mod 2 to find the one when number mod2 equals 1 it means there is a "One", I add 1 to count.
		 * And I divide Number by 2. It goes to like that.
		 */
		while (Number !=0)
		{		
			if (Number % 2 == 1)
			count++;
		Number = Number/2;		
		}
		System.out.print(""+count);
		
		
	}

}
