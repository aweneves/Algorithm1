package sort;

public class MergeSortDemo {
	private static void print(long[] a) {
		System.out.print("a : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}


	private static void mergeSort(long[] a,long[] temp, int left, int right) {
		if(left == right)
			return;
		int mid = (left + right) / 2;
		mergeSort(a,temp, left, mid);
		mergeSort(a,temp, mid+1, right);
		merge(a,temp, left, mid, right);
		
	}


	private static void merge(long[] a,long[] temp, int leftPtr, int mid, int right) {
//		int leftEnd = mid;
		int rightPtr = mid + 1;
		int left = leftPtr;
//		int leftLen = leftEnd - left + 1;
//		int rightLen = right - rightStart + 1;
		int j=0;
		while(leftPtr <= mid && rightPtr <= right){
			if(a[leftPtr] < a[rightPtr]){
				temp[j++] = a[leftPtr++];
			}else{
				temp[j++] = a[rightPtr++];
			}
		}
		while(leftPtr <= mid){
			temp[j++] = a[leftPtr++];
		}
		while(rightPtr <= right){
			temp[j++] = a[rightPtr++];
		}
		for(int i=0; i<j; i++){
			a[left+i] = temp[i];
		}
	}


	public static void main(String[] args) {
		long[] a = new long[10000];
		for (int i = 0; i < a.length; i++) {
			a[i] = (long) (Math.random() * 99);
		}
		print(a);
		long startTime = System.currentTimeMillis();
		long[] temp = new long[a.length];
		mergeSort(a, temp,0, a.length - 1);
		long endTime = System.currentTimeMillis();
		System.out.println("use: " + (endTime - startTime) + "ms");
		print(a);

	}
}
