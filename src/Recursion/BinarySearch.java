package Recursion;

public class BinarySearch {

	private static void find(int n, int[] a) {
		System.out.println("index: " + binSearch(n, a, 0, a.length-1));
	}

	private static int binSearch(int n, int[] a, int left, int right) {
		int center = (left + right) / 2;
		if (a[center] == n) {
			return center;
		} else if (left > right) {
			return -1;
		} else {
			if (a[center] > n) {
				return binSearch(n, a, left, center - 1);
			} else {
				return binSearch(n, a, center + 1, right);
			}
		}
//		return -1;

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 13, 55, 76 };
		find(9, a);

	}

}
