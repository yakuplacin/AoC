import java.util.Scanner;
public class AoCMetricConventer {

	public static void main(String[] args) {

		Scanner length = new Scanner(System.in);
		
		int  wh = length.nextInt();
		double inch; 
		int feet;
		/*1 inch is 2.54 cm, 1 foot is 12inches. for each inch, I divided "cm" by 2.54 for finding inch, 
		 * for each inch I divided "inch" by 12 for finding feet, and I write the output 
		 */
		inch = wh/2.54;
		feet = (int)inch/12;
		if (feet>=1) {
		inch = inch-(feet*12);
		System.out.print((int)feet + " feet and " + (int)inch + " inches" );}
		else
		System.out.print((int)feet + " feet and " + (int)inch + " inches" );
	}

}
