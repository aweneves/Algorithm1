package sort;

public class InsertSort2 {
	public static void main(String[] args) {
		int[] arrays = { 2, 8, 6, 2, 5,9, 1, 6, 7, 3 };
		display(arrays);
		insertSort(arrays);
		display(arrays);
	}

	private static void display(int[] arrays) {
		for(int i=0; i<arrays.length; i++){
			System.out.print(arrays[i] + " ");
		}
		System.out.println();
		
	}

	private static void insertSort(int[] arrays) {
		int in, out;
		for(out=1; out<arrays.length; out++){
			in = out;
			int temp = arrays[out];
			while(in > 0 && temp < arrays[in-1]){
				arrays[in] = arrays[in-1];
				in--;
			}
			arrays[in] = temp;
		}
		
	}

}
