package pctPapers;
// This problem you can find it on SOEN 6501 practice problem pdf. This is the first one. and remaining 3 also i have added.
import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		line = line.trim();
		String[] names = line.split("\\s+");
		StringBuilder sb = new StringBuilder();
		// String finalName = "";
		boolean isContinue = true;
		for (String string : names) {
			if (string.length() > 50) {
				System.out.println("Not Valid Input");
				isContinue = false;
				break;
			}
		}
		if (isContinue) {
			if (names.length == 3) {
				// finalName = names[2] + " " + names[0] + " " + names[1];
				sb.append(names[2] + " " + names[0] + " " + names[1]);

			} else if (names.length == 2) {
				String name = names[1];
				if (name.endsWith("a") || name.endsWith("e") || name.endsWith("i") || name.endsWith("o")
						|| name.endsWith("u") || name.endsWith("A") || name.endsWith("E") || name.endsWith("I")
						|| name.endsWith("O") || name.endsWith("U")) {
					// finalName = names[1] + " " + names[0];
					sb.append(names[1] + " " + names[0]);
				} else {
					// finalName = names[0] + " " + names[1];
					sb.append(names[0] + " " + names[1]);
				}
			} else if (names.length == 1) {
				// finalName = names[0];
				sb.append(names[0]);
			} else {
				System.out.println("Please try again");

			}
			System.out.println(sb.toString());
			sc.close();
		}
	}

}
