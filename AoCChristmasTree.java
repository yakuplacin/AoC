import java.util.Scanner;
public class AoCChristmasTree {

	public static void main(String[] args) {
		
		/* First I create Scanner for taking numbers. I ask nstars and mtrunk. After I put if else conditions because if n = 1, it will be like
		 * there is a space. It is a case like that. In else conditions, I put a "for" loop for putting spaces and in that "for" loop I again 
		 * open a "for" loop for writing *(stars). When spaces dicreases, stars increases. Something like that. After these for loop
		 * I open again a for loop for putting last line stars for nstars time. After that, I put an another "for" loop for writing trunk
		 * I thought its variables should be begin with -3 because I count and find like that. After that things, program prints out MERRY
		 * CHRISTMAS. Also in if conditions (which is above the all things), everything like that. just I put 1 space for first star. Because
		 * I thought its trunk should be on the mid.
		 */

		Scanner tree = new Scanner(System.in);
		
		int nstars = tree.nextInt();
		int mtrunk = tree.nextInt();
	
		if (nstars == 1) {
			System.out.println(" *");
			for(int i = 0; i < mtrunk ; i++) {
			System.out.println("| |");
			}	
			System.out.println(" MERRY CHRISTMAS");
		}
		else {
		for(int i = 0 ; i<nstars-1 ; i++) {
			
			for(int k = nstars-1; k>i ; k--) {
				System.out.print(" ");	
			}
			
			for(int j = 0; j<i+1;j++ ) {
				System.out.print("* ");
			}
			
		System.out.println();
		
		}
		
		for(int i = 0; i<nstars ; i++) {
			System.out.print("* ");
		}
		
		System.out.println();
		
		for(int p = 0 ; p<mtrunk ; p++) {
			
		for(int s = nstars-3; s>=0; s-- ) {
			System.out.print(" ");
			}
		System.out.print("| | ");
		System.out.println();
		}
	
	System.out.print("MERRY CHRISTMAS");
	
		}
	}

}
