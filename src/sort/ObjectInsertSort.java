package sort;

import java.util.*;

public class ObjectInsertSort {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("awen","tan",22));
		persons.add(new Person("wen","tan",22));
		persons.add(new Person("aen","tan",22));
		persons.add(new Person("en","tan",22));
		persons.add(new Person("jimort","tan",22));
		display(persons);
		insertSort(persons);
		display(persons);
	}

	private static void display(List<Person> ps) {
		for(Person p : ps){
			System.out.println(p);
		}
		System.out.println("******************");
		
	}

	private static void insertSort(List<Person> ps) {
		int in, out;
		for(out=1; out<ps.size(); out++){
			in = out;
			Person temp = ps.get(out);
			while(in > 0 && temp.getFirstName().compareToIgnoreCase(ps.get(in-1).getFirstName()) < 0){
				ps.set(in, ps.get(in-1));
				in--;
			}
			ps.set(in, temp);
//			arrays[in] = temp;
		}
		
	}

}
