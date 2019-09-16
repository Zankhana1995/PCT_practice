package pctPapers;

// This is the solution of the problem i have found from online PCT example. You can search like PCT problem "beverage sizing"
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BeverageSizing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] cupsizeArray = sc.nextLine().split("\\s+");
		int totalCustomer = sc.nextInt();
		List<String> inputLines = new ArrayList<>();
		for (int i = 0; i < totalCustomer; i++) {
			sc = new Scanner(System.in);
			String line = sc.nextLine();
			inputLines.add(line);
		}
		for (String string : inputLines) {
			String[] elements = string.split("\\s+");
			String outputSize = cupSize(cupsizeArray, elements[2], elements[3]);
			if (Integer.parseInt(elements[1]) < 18) {
				System.out.println(elements[0] + " " + "Water" + " " + outputSize + " " + elements[1] + " "
						+ elements[2] + " " + elements[3]);
			} else {
				System.out.println(elements[0] + " " + "Beer" + " " + outputSize + " " + elements[1] + " " + elements[2]
						+ " " + elements[3]);
			}
		}
		sc.close();
	}

	public static String cupSize(String[] cupsizeArray, String foot, String inch) {
		String cupsize = "";
		double footInt = Integer.parseInt(foot);
		double inchInt = Integer.parseInt(inch);
		double totalHeight;
		Integer[] cupSizeIntArray = new Integer[cupsizeArray.length];
		for (int i = 0; i < cupsizeArray.length; i++) {
			cupSizeIntArray[i] = Integer.parseInt(cupsizeArray[i]);
		}
		if (footInt < 5) {
			totalHeight = footInt * 10 + (inchInt / 12) * 10;
		} else {
			double difference = footInt - 5;
			totalHeight = 50 + difference * 8 + (inchInt / 12) * 8;
		}
		if (totalHeight <= cupSizeIntArray[0]) {
			cupsize = "ExtraSmall";
		} else if (totalHeight > cupSizeIntArray[0] && totalHeight <= cupSizeIntArray[1]) {
			cupsize = "Small";
		} else if (totalHeight > cupSizeIntArray[1] && totalHeight <= cupSizeIntArray[2]) {
			cupsize = "Medium";
		} else {
			cupsize = "Large";
		}
		return cupsize;
	}
}
