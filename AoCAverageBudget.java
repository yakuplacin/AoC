import java.util.Scanner;
public class AoCAverageBudget {

	public static void main(String[] args) {
		
		/* I create a Scanner for getting numbers. I set sum and cnt equal 0 for beginning. And I open a "for" loop for taking incomes
		 * and summation until user gives a "0" and every step cnt++. After that I ask the average money from user. I also divide summation by cnt
		 * for taking others average. And I open if else conditions. If it is bigger than it prints out above, if it is lower it prints out below
		 * and if it is the same, it prints out exactly like that.
		 */

		Scanner earn = new Scanner(System.in);
		
		long sum = 0;
		long cnt = 0;
		
		for(int i = 0; i >= 0 ; i++) {
		
			long income = earn.nextLong();
			
			if(income == 0) {
				break;
			}
			sum = sum + income;
			cnt++;		
		}
		
		long average = earn.nextLong();
		
		double averageEarn = (sum)/(cnt);
		
		if (average < averageEarn) {
			System.out.print("Your income is below average");
		}
		else if (average > averageEarn) {
			System.out.print("Your income is above average");
		}
		else if (averageEarn == average) {
			System.out.print("Your income is exactly average");
		}
		
	}

}
