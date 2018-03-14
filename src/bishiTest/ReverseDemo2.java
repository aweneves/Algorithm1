package bishiTest;

import java.util.ArrayList;
import java.util.List;

public class ReverseDemo2 {
	public static void main(String[] args) {
		String a = "1234560000";
		char[] re = reverse(a);
	}

	private static char[] reverse(String shortStr) {
		char[] shortChar = new char[shortStr.length()];
		for(int i=0; i<shortStr.length(); i++){
			shortChar[shortChar.length-1-i] = shortStr.charAt(i);
		}
//		int count = 0;
		//求出有几个0前缀
		boolean flag = false;
		char[] result = new char[shortChar.length];
		int j=0;
		for(int i=0; i<shortChar.length; i++){
			if(shortChar[i]!=48){
				flag = true;
			}
			if(flag){
				result[j++] = shortChar[i];
			}
		}
		for(char c : result){
			System.out.print(c);
		}
//		System.out.println(count);
//		char[] result = new char[shortChar.length-count];
//		for(int i=count; i<shortChar.length; i++){
//			result[i-count] = shortChar[i];
////			System.out.print(result[i-count]);
//		}
		return result;
		
	}
	

}
