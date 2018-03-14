package sort;

public class QuickSortDemo2 {
	private static void print(long[] a) {
		System.out.print("a : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	private static void quickSort(long[] a, int left, int right) {
		if (right - left + 1 <= 10) {
			insertSort(a, left, right);
		} else {
			long median = getMedian(a, left, right);
			int partition = partitionInt(a, left, right, median);
			quickSort(a, left, partition-1);
			quickSort(a, partition+1, right);
		}
	}

	private static int partitionInt(long[] a, int left, int right, long median) {
		int leftPtr = left;
		int rightPtr = right - 1;
		while (true) {
			while (a[++leftPtr] < median)
				;
			while (a[--rightPtr] > median)
				;
			if(leftPtr >= rightPtr){
				break;
			}
			swap(a,leftPtr,rightPtr);
		}
		swap(a, leftPtr, right-1);
		return leftPtr;
	}

	private static long getMedian(long[] a, int left, int right) {
		int center = (left + right) / 2;
		if (a[left] > a[center]) {
			swap(a, left, center);
		}
		if (a[left] > a[right]) {
			swap(a, left, right);
		}
		if (a[center] > a[right]) {
			swap(a, center, right);
		}
		swap(a, center, right - 1);
		return a[right - 1];
	}

	private static void insertSort(long[] a, int left, int right) {
		int in, out;
		for (out = left + 1; out <= right; out++) {
			in = out;
			long temp = a[out];
			while (in > left && a[in - 1] > temp) {
				a[in] = a[in - 1];
				--in;
			}
			a[in] = temp;
		}

	}

	private static void swap(long[] a, int i, int j) {
		long temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		long[] a = new long[10000];
		for (int i = 0; i < a.length; i++) {
			a[i] = (long) (Math.random() * 99);
		}
		print(a);
		long startTime = System.currentTimeMillis();
		quickSort(a, 0, a.length - 1);
		long endTime = System.currentTimeMillis();
		System.out.println("use: " + (endTime - startTime) + "ms");
		print(a);

	}

}
