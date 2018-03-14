package sort;

public class ShellSort2 {
	public static void main(String[] args) {
		int[] arrays = { 2, 8, 6, 2, 5, 9, 1, 6, 7, 3 };
		display(arrays);
		insertSort(arrays);
		display(arrays);
	}

	private static void display(int[] arrays) {
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + " ");
		}
		System.out.println();

	}

	private static void insertSort(int[] arrays) {
		int in, out;
		int h = 1;
		while (h * 3 + 1 < arrays.length) {
			h = h * 3 + 1;
		}
		while (h > 0) {
			for (out = h; out < arrays.length; out++) {
				in = out;
				int temp = arrays[out];
				while (in > h - 1 && temp < arrays[in - h]) {
					arrays[in] = arrays[in - h];
					in -= h;
				}
				arrays[in] = temp;
			}
			h = (h-1) / 3;
		}
	}

}
