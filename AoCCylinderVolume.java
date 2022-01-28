import java.util.Scanner;
public class AoCCylinderVolume {

	public static void main(String[] args) {
		
		/* I create a Scanner for getting numbers from user. I put radius and height nextInt as a scanner. And I put volume nextDouble as a scanner
		 * After that, I calculate the normal volume of the cylinder. for printing out, I put if else conditions for finding needed volume
		 * like if it is bigger than given volume it says that number with a "+". if it is lower than given volume, it says that number with a "-" 
		 * if it is 0, then it will write 0.000
		 */

		
		Scanner vol = new Scanner(System.in);
		
		int radius = vol.nextInt();
		int height = vol.nextInt();	
		double volume = vol.nextDouble();
		
		double YourVolume;
		YourVolume = (3.14)*radius*radius*height;
		
		double needed;
		needed = YourVolume - volume;
		
		if(needed < 0)
		System.out.printf("%.3f",needed);
		
		else if (needed > 0)
		System.out.printf("+%.3f",needed);
		
		else if (needed == 0)
		System.out.printf("%.3f",needed);
		
		
	}

}
