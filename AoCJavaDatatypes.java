import java.util.Scanner;
public class AoCJavaDatatypes {

	public static void main(String[] args) {
	
		
	

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
   /*I ask t for how many times program writes, and put it in a "for" circle. 
    *And check it in a try. if number is byte then writes bye, if short writes short, if int writes int, 
    *and writes long if it is in the  domain of long. If number is bigger than that domain (it is an exception) then write can't be fitted. 
    */
            try			
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if (x >= -32768 && x<=32767) System.out.println("* short");
                if (x >= -2147483648 && x<= 2147483647) System.out.println("* int");
                System.out.println("* long");
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
		
		
		
		
		
		
		
		/*	Scanner HowBig = new Scanner(System.in);
		
		long Number = HowBig.nextInt();
			
	/*	if (Number >= 21333333333333)
		
		/*if (Number >= (2^63 -1) || Number < -(2^63) ) //long
			System.out.println(Number + " can't be fitted anywhere.");
		else if (Number <= )
		*/
		
		
		
		// int - 2^31 ile  2^31 -1 arasý
		// short -32768 ile 32767 arasý 
		//byte -128 ile 127 arasý
	}

}}}
