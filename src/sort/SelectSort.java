package sort;

public class SelectSort {
	public static void main(String[] args) {
		int[] arrays = { 2, 8, 6, 2, 5,9, 1, 6, 7, 3 };
		display(arrays);
		selectSort(arrays);
		display(arrays);
	}

	private static void display(int[] arrays) {
		for(int i=0; i<arrays.length; i++){
			System.out.print(arrays[i] + " ");
		}
		System.out.println();
		
	}

	private static void selectSort(int[] a) {
		int out, in, k;
		for(out=0; out<a.length-1; out++){
			k=out;
			for(in=out+1; in<a.length; in++){
				if(a[k] > a[in]){
					k = in;
				}
			}
			if(k!=out){
				int temp = a[k];
				a[k] = a[out];
				a[out] = temp;
			}
		}
		
	}

}
