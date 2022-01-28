import java.util.Scanner;

public class AoCKLetter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		for(int i = 0; i<number/2;i++) {
			System.out.print("*");
			for(int j =number/2; j>i;j--) {
				System.out.print(" ");
			}
			System.out.println("*");

		}
		
		for(int i = number/2;i>0;i--) {
			
		}
	}

}
