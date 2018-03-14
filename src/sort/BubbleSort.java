package sort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arrays = { 2, 8, 6, 2, 5,9, 1, 6, 7, 3 };
		display(arrays);
		bubbleSort(arrays);
		display(arrays);
	}

	private static void display(int[] arrays) {
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + " ");
		}
		System.out.println();

	}

	private static void bubbleSort(int[] a) {
		int i,j;
		for(i=0; i<a.length-1; i++){
			for(j=a.length-1; j>i; j--){
				if(a[j] < a[j-1]){
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
	}

}
