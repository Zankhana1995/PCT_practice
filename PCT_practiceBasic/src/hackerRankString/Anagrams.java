package hackerRankString;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	static boolean isAnagram(String a, String b) {
		// Map<String, Integer> map = new HashMap<>();
		// for (int i = 0; i < a.length(); i++) {
		// String str = Character.toString(a.charAt(i));
		// if (map.containsKey(str)) {
		// int value = map.get(str);
		// map.put(str, value + 1);
		// } else {
		// map.put(str, 1);
		// }
		// }
		char[] charArrayA= a.toCharArray();
//		char[] charArrayA2 = new char[charArrayA.length];
//		int count;
//		for (int i = 0; i < charArrayA.length; i++) {
//			count = 0;
//			for (int j = 0; j < charArrayA.length; j++) {
//				if (charArrayA[i] > charArrayA[j]) {
//					count++;
//				}
//			}
//			charArrayA2[count] = charArrayA[i];
//		}
		 Arrays.sort(charArrayA);
		String newA = new String(charArrayA);
		//System.out.println(newA);
		char[] charArrayB= b.toCharArray();
		
		
		
//		char[] charArrayB2 = new char[charArrayB.length];
		 Arrays.sort(charArrayB);
//		for(int i=0;i<charArrayB.length;i++)
//		{
//			count=0;
//			for(int j=0;j<a.length();j++)
//			{
//				if(charArrayB[i]>charArrayB[j])
//				{
//					count++;
//				}
//			}
//			charArrayB2[count] = charArrayB[i];
//		}
		String newB = new String(charArrayB);
//		System.out.println(newB);
		if (newA.equals(newB)) {
			return true;
		} else {
			return false;
		}

		// Complete the function
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
