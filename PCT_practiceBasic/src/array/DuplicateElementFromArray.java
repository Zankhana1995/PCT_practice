package array;

import java.util.Arrays;

public class DuplicateElementFromArray {
	public static void main(String[] args) {
		int[] array = { 1,3,4,4,2,6,5,2 };
		//1,2,2,3,4,4,5,6
		Arrays.sort(array);
		int k = 0;
		int[] newArray = new int[array.length];
		for (int i = 0; i < array.length-1; i++) {

			if (array[i] != array[i+1]) {
				newArray[k]=array[i];
				k++;
			}
			
		}
		
		newArray[k]=array[array.length-1];
		k++;
		
		for (int i = 0; i < k; i++) {
			System.out.println(newArray[i]);
		}

	}
}
