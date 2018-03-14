package bishiTest;

public class BigIntegerDemo {
	public static void main(String[] args) {
		String a = "12345624678";
		String b = "4563547";
		int[] result = calculateBigInt(a,b);
		if(result[0] > 0){
			System.out.print(result[0]);
		}
		for(int i=1; i<result.length; i++){
			System.out.print(result[i]);
		}
	}

	private static int[] calculateBigInt(String a, String b) {
		String longStr = a.length()>b.length()?a:b;
		String shortStr = a.length()>b.length()?b:a;
//		String[] s = longStr.split("");
		shortStr = reverse(shortStr);
		for(int i=shortStr.length(); i<longStr.length(); i++){
			shortStr += "0";
		}
		shortStr = reverse(shortStr);
		int len = shortStr.length();
		int k = 0;
		int[] result = new int[len+1];
		for(int i=len-1; i>=0; i--){
			int sum;
			int m = Integer.valueOf(String.valueOf(longStr.charAt(i)));
			int n = Integer.valueOf(String.valueOf(shortStr.charAt(i)));
			sum = (m+n+k) % 10;
			k = (m+n+k) / 10;
			result[i+1] = sum;
		}
		result[0] = k;
		return result;
	}

	private static String reverse(String shortStr) {
		char[] shortChar = new char[shortStr.length()];
		for(int i=0; i<shortStr.length(); i++){
			shortChar[shortChar.length-1-i] = shortStr.charAt(i);
		}
		return String.valueOf(shortChar);
	}
	

}
