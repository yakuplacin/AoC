import java.util.Scanner;
public class AoCMultiplier {

	public static void main(String[] args) {
		
		/*	I create a Scanner for taking numbers from user. I open 2 array one of them which is array[] is related to taking 
		 * 	the given 2 numbers and other one (array2[][] like 2darray) for taking the each of digit of numbers. Also in the beginning 
		 * 	I set sum=0 and cnt = 1 I used that two items for calculating next steps.
		 *  I open a for loop for finding the digit for array2[][]
		 * 	I set number = array[i] that equals number and in that for loop again I open a "for" loop. and I did the procedure like
		 * 	every circle digit = number%10 and number= number-digit, number= number/10, it means every for loop, program makes that digit
		 * 	to array2[i][j] something like that. After separating each digit, now we have the array2[][] completely, I open a for loop
		 * for adding. I thought and find like every second(2.) numbers' digit times first number (whole number) equals that step and
		 * I thought if I multiply this solution by step*10 and add all these steps, I can find the real solution. I did this with 10*cnt
		 * and every step cnt = cnt*10. After all things, I divide the final sum by 10 because I already multiply by 10 in first case, It means
		 * one 10 is extra. So I made program prints out sum/10.
		 * 
		 * 
		 * 
		 */

		
		Scanner sc = new Scanner(System.in);
		
		int digits = sc.nextInt();
		long[] array = new long[2];
		long sum = 0;
		long cnt = 1;
		for (int i = 0; i < 2; i++) {
			array[i] = sc.nextInt();					
		}
		
		long[][] array2 = new long[2][digits];
		
		for(int i = 0; i < 2 ; i++) {
			
			long number = array[i];
				for(int j = digits -1 ; j >= 0 ; j--) {
					long digit = number % 10;
					array2[i][j] = digit;
					number = number - digit;
					number = number/10;			
				}
						
		}			
			
		
		for(int j = digits-1 ; j >= 0; j--) {
		
			long add = (array[0] * array2[1][j])*(10*cnt) ;
				
				sum = sum + add;
				cnt = cnt * 10 ;
			
				
		}	
			
		System.out.println(sum/10);
	}
	
}
