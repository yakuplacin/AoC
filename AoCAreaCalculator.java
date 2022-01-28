import java.util.Scanner;

public class AoCAreaCalculator {

	public static void main(String[] args) {

		Scanner area = new Scanner(System.in);
		
		int FirstN = area.nextInt();
		int SecondN = area.nextInt();
		int rectangle;
		double ellipse;
		/*First I ask the the two numbers which are lengths. And I evaluate rectangle area with a*b, ellipse area with pi*a*b
		 * 
		 */
		
		rectangle = FirstN * SecondN;
		ellipse = 3.14 * FirstN * SecondN;
		
		System.out.println("Area - rectangle: " + rectangle);
		System.out.printf("Area - ellipse: %.3f \n",ellipse);
		
		
	}

}
