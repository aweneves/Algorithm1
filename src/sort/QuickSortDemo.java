package sort;

public class QuickSortDemo {
	public static void main(String[] args) {
		int[] arrays = { 2, 8, 6, 2, 5,9, 1, 6, 7, 3 };
		display(arrays);
		quickSort(arrays);
		display(arrays);
	}

	private static void display(int[] arrays) {
		for(int i=0; i<arrays.length; i++){
			System.out.print(arrays[i] + " ");
		}
		System.out.println();
		
	}

	private static void quickSort(int[] arrays) {
		
		
	}

}
