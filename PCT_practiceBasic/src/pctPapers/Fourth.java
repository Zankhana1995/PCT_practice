package pctPapers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Fourth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> inputOpe = new ArrayList<>();
		int numOfStrings = sc.nextInt();
		for (int i = 0; i < numOfStrings; i++) {
			String line = sc.next();
			inputOpe.add(line);
		}
		checkString(inputOpe);
		sc.close();
	}

	private static void checkString(List<String> line) {
		boolean result = false;
		for (String string : line) {
			Stack<String> st = new Stack<String>();
			int count = 0;
			for (int i = 0; i < string.length(); i++) {
				String charstr = Character.toString(string.charAt(i));
				if (charstr.equals("{") || charstr.equals("[") || charstr.equals("(")) {
					st.push(charstr);
					count++;
				} else if (charstr.equals("}") || charstr.equals("]") || charstr.equals(")")) {
					if (st.isEmpty()) {
						result = false;
					} else if (!MatchingPair(st.pop(), charstr)) {
						result = false;
						break;

					} else {
						count--;
						result = true;
					}
				}
			}
			System.out.println(result);
		}
	}

	private static boolean MatchingPair(String item, String charstr) {

		if (item.equals("{") && charstr.equals("}")) {
			return true;
		} else if (item.equals("(") && charstr.equals(")")) {
			return true;
		} else if (item.equals("[") && charstr.equals("]")) {
			return true;
		}
		return false;
	}

}
