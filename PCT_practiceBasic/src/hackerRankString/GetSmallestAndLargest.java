package hackerRankString;

import java.util.Scanner;

public class GetSmallestAndLargest {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String subS = s.substring(i, j);
				if (subS.length() == k) {
					if (subS.compareTo(largest) > 0) {
						largest = subS;
					}
					if (subS.compareTo(smallest) < 0 || smallest == "") {
						smallest = subS;
					}
				}
			}
		}
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();
		System.out.println(getSmallestAndLargest(s, k));
	}
}
