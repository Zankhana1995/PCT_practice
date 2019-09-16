package pctPapers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Second {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		line = line.trim();
		Set<String> set = new HashSet<>();
		if (line.length() < 2000 && !line.isEmpty()) {
			String[] words = line.split("\\s+");
			if (words.length > 0) {
				for (int i = 0; i < words.length; i++) {
					words[i] = words[i].toLowerCase().trim();
					set.add(words[i]);
				}
				System.out.println("set size ==>  " + set.size());

				Arrays.sort(words);
				for (String string : words) {
					System.out.println(string);
				}
				int count = 1;
				for (int i = 0; i < words.length - 1; i++) {
					if (!words[i].equals(words[i + 1])) {
						count++;
					}
				}
				System.out.println(count);
			} else {
				System.out.println("Please try again");
			}
			sc.close();

		} else {
			System.out.println("Please enter less than 2000 line character");
		}
	}
}
