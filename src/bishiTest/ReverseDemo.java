package bishiTest;

public class ReverseDemo {
	public static void main(String[] args) {
		String a = "1234560000";
		char[] re = reverse(a);
		for(int i=0; i<re.length; i++){
			System.out.print(re[i]);
		}
	}

	private static char[] reverse(String shortStr) {
		char[] shortChar = new char[shortStr.length()];
		for(int i=0; i<shortStr.length(); i++){
			shortChar[shortChar.length-1-i] = shortStr.charAt(i);
		}
		int count = 0;
		//求出有几个0前缀
		for(int i=0; i<shortChar.length; i++){
			if(shortChar[i]==48){
				count ++;
			}else{
				break;
			}
		}

		char[] result = new char[shortChar.length-count];
		for(int i=count; i<shortChar.length; i++){
			result[i-count] = shortChar[i];

		}
		return result;
		
	}
	

}
