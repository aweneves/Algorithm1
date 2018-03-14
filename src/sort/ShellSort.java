package sort;

public class ShellSort {
	public static void main(String[] args) {
		int[] arrays = { 2, 8, 6, 2, 5,9, 1, 6, 7, 3 };
		display(arrays);
		shellSort(arrays);
		display(arrays);
	}

	private static void display(int[] arrays) {
		for(int i=0; i<arrays.length; i++){
			System.out.print(arrays[i] + " ");
		}
		System.out.println();
		
	}

	private static void shellSort(int[] arrays) {
		int out, in;
		for(out=1; out<arrays.length; out++){
			int temp = arrays[out];
			in = out;
			while(in > 0 && temp < arrays[in-1]){	
				arrays[in] = arrays[in-1];
				--in;
			}
			arrays[in] = temp;
			
		}
		
	}

}
