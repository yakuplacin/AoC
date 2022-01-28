import java.util.Scanner;

public class AoCBinary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int sum = 0;
		int step = 1;
		int t = 1;
		while(number!=0) {
			int remainder = number % 10;
			number = number - remainder;
			number = number / 10;
			t = step * remainder;
			step = step * 2;
			sum = sum + t;
		}
		
		System.out.println(sum);
	}

}
