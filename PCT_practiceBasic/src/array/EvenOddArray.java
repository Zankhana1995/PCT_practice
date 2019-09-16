package array;

import java.util.Scanner;

public class EvenOddArray {
	public static void main(String[] args) {
		int[] numbersArray = new int[10];
		Scanner num = new Scanner(System.in);
		System.out.println("Add numbers");
		for (int i = 0; i < numbersArray.length; i++) {
			numbersArray[i] = num.nextInt();
		}
		int[] oddArray = new int[10];
		int[] evenArray = new int[10];
		int j = 0, k = 0;
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] % 2 == 0) {
				oddArray[j] = numbersArray[i];
				j++;
			} else {
				evenArray[k] = numbersArray[i];
				k++;
			}
		}
		System.out.println("Odd numbers");
		for (int i = 0; i < k; i++) {
			System.out.println(evenArray[i]);
		}
		System.out.println("Even Numbers");
		for (int i = 0; i < j; i++) {
			System.out.println(oddArray[i]);
		}
	}
}
