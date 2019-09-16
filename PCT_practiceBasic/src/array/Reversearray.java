package array;

import java.util.Scanner;

public class Reversearray {
	public static void main(String[] args) {
		int[] scores = new int[7];
		Scanner num = new Scanner(System.in);
		for (int i = 0; i < scores.length; i++) {
			scores[i] = num.nextInt();
		}
		// reverse
		int[] scores1 = new int[scores.length];
		int j = 0;
		for (int i = scores.length - 1; i >= 0; i--) {
			scores1[j] = scores[i];
			j++;
		}
		for (int i = 0; i < scores1.length; i++) {
			System.out.println(scores1[i]);
		}
		num.close();
	}

}
