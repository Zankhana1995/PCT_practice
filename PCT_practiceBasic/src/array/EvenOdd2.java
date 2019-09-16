package array;

import java.util.ArrayList;
import java.util.List;

public class EvenOdd2 {

	public static void main(String[] args) {
		int[] numbersArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 56, 76, 89, 23, 56, 89, 100, 45, 67, 32,
				45 };
		int oddArraylength = 0;
		int evenArrayLength = 0;
		System.out.println(numbersArray.length);
		int j = 0, k = 0;
		List<Integer> oddlist = new ArrayList<>();
		List<Integer> evenList = new ArrayList<>();
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] % 2 == 0) {
				evenList.add(numbersArray[i]);
				evenArrayLength++;
			} else {
				oddlist.add(numbersArray[i]);
				oddArraylength++;
			}
		}
		int[] oddArray = new int[oddArraylength];
		int[] evenArray = new int[evenArrayLength];
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] % 2 == 0) {
				evenArray[j] = numbersArray[i];
				j++;
			} else {
				oddArray[k] = numbersArray[i];
				k++;
			}
		}
		System.out.println("Odd numbers");
		for (int i = 0; i < j; i++) {
			System.out.println(evenArray[i]);
		}
		System.out.println("Odd list====>   " + oddlist);
		System.out.println("Even Numbers");
		for (int i = 0; i < k; i++) {
			System.out.println(oddArray[i]);
		}
		System.out.println("Even list====>   " + evenList);
	}

}
