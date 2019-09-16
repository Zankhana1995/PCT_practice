//Given two strings of lowercase English letters,  and , perform the following operations:
//Sum the lengths of  and .
//Determine if A is lexicographically larger than  B(i.e.: does  B come before A in the dictionary?).
//Capitalize the first letter in  and  and print them on a single line, separated by a space.
package hackerRankString;

import java.util.Scanner;

public class DictionaryRanking {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		System.out.println(A.length() + B.length());
		int result = A.compareTo(B);
		if (result > 0) {
			System.out.println("Yes");
		} else if (result < 0) {
			System.out.println("No");
		} else {
			System.out.println("No");//equal
		}
		System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.toUpperCase().charAt(0)
				+ B.substring(1, B.length()));
		sc.close();
	}
}
