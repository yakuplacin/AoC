import java.util.Scanner;
public class AoCLockdownTimer {

	public static void main(String[] args) {
		
		/* I open a scanner for getting information and Ask information about user. I set mhours and mminutes to 0 that can be used for
		 * how much time they have. I open many if else conditions for giving information about user. if age is between 20and65 He/She can go
		 * outside between 5-21 and I calculate this. If mminutes is bigger than 60, I subtract 60 from minute and add 1 to mhours. 
		 * For who are under 20 or bigger 65, They can go 13-17 and I calculate this situation like first part. Nearly same things. And also I 
		 * check if it is saturday or sunday, anyone can go outside and program will say You can't go out!. 
		 */

		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		String day = sc.next();
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		int mhours = 0;
		int mminutes = 0;
	
		if(age <= 65 && age >= 20) {
		if(day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("You can't go out!");
		}	
		else 
		{	if (hour >= 5 && hour < 21 ) {
				if(minute != 0) {
			mhours = 21-hour-1;
		}		else if(minute == 0) {
			mhours = 21-hour;
		}
			mminutes = 60 - minute;
			if(mminutes > 60) {
				mminutes = mminutes - 60;
				mhours = mhours+1;
			}
			System.out.println("You can go out and you have "+mhours+" hours and "+mminutes+" minutes to be outside!");
		}
		    else
		    	System.out.println("You can't go out!");
		}
		
		}
		if (age > 65 || age < 20) {
		if(day.equals("Saturday") || day.equals("Sunday"))
				System.out.println("You can't go out!");
		else 
		{	
			if(hour >= 13 && hour < 17) {
				if (minute != 0) {
				mhours = 17-hour-1;	
			}	else if ( minute == 0) {
				mhours = 17-hour;
			}	
				mminutes = 60-minute;
			if(mminutes > 60) {
				mminutes = mminutes - 60;
				mhours = mhours+1;
				}
			System.out.println("You can go out and you have "+mhours+" hours and "+mminutes+" minutes to be outside!");
		}
			else
				System.out.println("You can't go out!");
			
		}
		
		}
		
		
	}

}
