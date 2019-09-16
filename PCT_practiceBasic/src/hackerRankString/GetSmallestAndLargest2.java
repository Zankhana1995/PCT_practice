package hackerRankString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetSmallestAndLargest2 {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";;
		List<String> filteredList = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String subS = s.substring(i, j);
				if (subS.length() == k) {
					filteredList.add(subS);
				}
			}
		}
		String shortest = filteredList.get(0);
		String longest = filteredList.get(0);
		for (String string : filteredList) {
			if (string.compareTo(longest) > 0) {
				longest = string;
			}
		}
		for (String string : filteredList) {
			if (string.compareTo(shortest) < 0) {
				shortest = string;
			}
		}
		smallest = shortest;
		largest = longest;
		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

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
