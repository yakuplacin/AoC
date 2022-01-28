import java.util.Scanner;
public class AocKCM {

	public static void main(String[] args) {
		
		
		/* I create a Scanner for getting numbers. I ask array's length(howMany) and level of formula. And I create an array. 
		 * and open a for loop for getting numbers of array from user. After that I open a "for" loop in an another "for" loop for addition.
		 * and I set array[j] = array[j]+array[j+1] it continuous for levelOf times. Finally, I open a "for" loop for printing out. It ends
		 * when variable equals howMany-levelOf. Because every level we lose 1 number like that.
		 */

		Scanner kayseri = new Scanner(System.in);
		
		int howMany = kayseri.nextInt();
		
		int levelOf = kayseri.nextInt();
		
		int[] array = new int[howMany];
		
		for(int i = 0; i<howMany ; i++) {
						
			array[i] = kayseri.nextInt();			
			
		}
		
		for (int k = 0 ; k < levelOf ; k++) {
			
			for ( int j = 0; j<howMany-1; j++) {
				
			array[j] = array[j]+array[j+1];	
			
			
			}
		}
		
		for (int l = 0; l<howMany - levelOf ; l++) {
			System.out.print(array[l]+" ");
		}
		
		
		
	}

}
