package Recursion;

public class PowerDemo {
	private static int power(int i, int j) {
		if(j==1){
			return i;
		}else{
			if(j%2==1){
				return power(i*i,j/2)*i;
			}
			return power(i*i,j/2);
		}
		
	}
	public static void main(String[] args) {
		System.out.println(power(2,12));

	}

	

}
