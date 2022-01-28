import java.util.Scanner;

public class AoCWordFilter {

	public static void main(String[] args) {

		/*
		 * I create a Scanner for getting information. And I take a string for taking
		 * first word. I use a char x = word.charAt0 that finds the first letter of
		 * word. If there is no word (I check it with char table, 65 is "A" and other
		 * letters are bigger than 65) it says 0. And I open if else conditions. If
		 * first word is 0 or " "(nothing), it means it ends quickly. If it is not 0, I
		 * open "for" loop for taking words. and I say if word.length is bigger than 5 I
		 * have to write that word. Until user gives a "0", program continuous and
		 * writes words. And also if word is with capital letters I check it, and I put
		 * .toLowerCase conditions.
		 */

		Scanner sc = new Scanner(System.in);

		String word = sc.next();
		int cnt = 0;

		if (word.equals("0"))
			System.out.print("0");
		else
			for (int i = 0; i >= 0; i++) {
				cnt = 0;
				word = sc.next();

				for (int j = 0; j < word.length(); j++) {

					if ((word.charAt(i) >= 65 && word.charAt(i) < 127)
							|| (word.charAt(i) >= 90 && word.charAt(i) < 123))
						cnt++;

					if (cnt > 5)
						System.out.print(word + " ");
				}
					if (word.equals("0"))
						break;

			

			}

	}
}
