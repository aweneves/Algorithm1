package Recursion;

public class TowersDemo {
	private static void doTowers(int max, char source, char temp, char targe) {
		if (max == 1) {
			System.out.println("disk1 from " + source + " to " + targe);
		} else {
			doTowers(max - 1, source, targe, temp);
			System.out.println("disk" + max + " from " + source + " to " + targe);
			doTowers(max - 1, temp, source, targe);
		}
	}

	public static void main(String[] args) {
		doTowers(4, 'A', 'B', 'C');

	}

}
