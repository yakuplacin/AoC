import java.util.Scanner;
public class AoCVolumeCalculator {

	public static void main(String[] args) {
		
		/* I create a Scanner for getting inputs. I separate all things in if else conditions. I calculate everything like that.
		 * If given text is Sphere, program will take 1 input which is radius and calculate sphere volume And will write the final volume.
		 * Like Sphere, other conditions will do like that. For example for a rectangularprism, program takes l, h, and w and calculate volume. etc.  
		 */

		
		Scanner volume = new Scanner(System.in);
		
		String format = volume.next();
		
		double Volume = 0;
		
		if(format.equals("Sphere")) {
			double radius = volume.nextDouble();
			
			Volume = (4*(3.14)*radius*radius*radius)/3;
			
		}
		else if(format.equals("Cube")) {
			double length = volume.nextDouble();
			
			Volume = length*length*length;
			
		}
		else if(format.equals("Rectangularprism")) {
			double length = volume.nextDouble();
			double width = volume.nextDouble();
			double height = volume.nextDouble();
		
			Volume = length * width * height;
		
		}
		else if(format.equals("Cylinder")) {
			double radius = volume.nextDouble();
			double height = volume.nextDouble();
		
			Volume = (3.14)*radius*radius*height;
		
		}
		else if(format.equals("Cone")) {
			double radius = volume.nextDouble();
			double height = volume.nextDouble();
			
			Volume = ((3.14)*radius*radius*height)/3;	
			
		}
		
	System.out.printf("%.2f",Volume);
		
	}

}
