package Test;

import java.util.*;
class Test{
	private String a;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}
	
}
public class ForAndForeach {
	public static void main(String[] args) {
//		double[] a = new double[10000000];
		List<String> a = new ArrayList<String>();
//		List<String> a = new LinkedList<String>();
//		long startTime = System.nanoTime();
//		for(int i=0; i<a.length; i++){
//			a[i] = Math.random()*100;
//		}
		for(int i=0; i<10; i++){
			a.add(new String("t"));
		}
		
		long startTime = System.nanoTime();
//		for(double s : a){
//		
//		}
//		for(String s : a){
//			s = "c";
//		}
//		for(int i=0; i<a.length; i++){
//			
//		}
//		for(int i=0; i<a.size(); i++){
//			
//		}
		Iterator<String> it = a.iterator();
		while(it.hasNext()){
			String s = it.next();
//			s += "asdf";
//			System.out.println(s);
		}
		for(String s : a){
			System.out.println(s);
		}
		long endTime = System.nanoTime();
		System.out.println(endTime - startTime);
	}

}
