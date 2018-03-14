package sort;

public class QucikSortDemo {
	private static void print(int[] a) {
		System.out.print("a : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	private static void quickSort(int[] a, int left, int right) {
		int size = right - left + 1;
		if (size <= 10) {
			insertSort(a, left, right);
		} else {
			int median = getMedian(a, left, right);
			int povit = partitionInt(a, left, right, median);
			quickSort(a, left, povit - 1);
			quickSort(a, povit - 1, right);
		}
	}

	private static void insertSort(int[] a, int left, int right) {
		int in,out;
	//	int size = right-left+1;
		for(out=left+1; out<=right; out++){
			in = out;
			int temp = a[in];
			while(in > left && a[in-1] >= temp){
				a[in] = a[in-1];
				--in;
			}
			a[in] = temp;
		}
	}

	private static int partitionInt(int[] a, int left, int right, int povit) {
		int leftPtr = left;
		int rightPtr = right - 1;
		while (true) {
			//用这个方法判断能够减少交换次数，但会增加比较次数
//			while (leftPtr < right && a[++leftPtr] <= povit)
//				;
//			while (rightPtr > left && a[--rightPtr] >= povit) 
//				;
			//这个方法能够减少比较次数，但增加了交换的次数
			while (a[++leftPtr] < povit)
				;
			while (a[--rightPtr] > povit)
				;
			if (leftPtr >= rightPtr) {
				break;
			}
			swap(a, leftPtr, rightPtr);
		}
		swap(a, leftPtr, right - 1);
		return leftPtr;
	}

	private static int getMedian(int[] a, int left, int right) {
		int center = (right + left) / 2;
		if (a[center] < a[left]) {
			swap(a, center, left);
		}
		if (a[right] < a[left]) {
			swap(a, right, left);
		}
		if (a[right] < a[center]) {
			swap(a, right, center);
		}
		swap(a, center, right - 1);
		return a[right - 1];
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		int[] a = new int[100000];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 99);
		}
	//	print(a);
		long startTime = System.currentTimeMillis();
		quickSort(a, 0, a.length - 1);
		long endTime = System.currentTimeMillis();	
		System.out.println("use: " + (endTime-startTime) + "ms");
		print(a);
		
	}

}
