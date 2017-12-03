package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ComparableClass implements Comparable<ComparableClass> {

	int eno;
	String ename;

	ComparableClass(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}

	public static void main(String[] args) {
//by default String class and wrapper classes are comparable
		int[] array = { 10, 40, 30, 20 };
		String[] arr = { "india", "america" };
		Arrays.sort(array);
		Arrays.sort(arr);
		System.out.println("number sort: " + Arrays.toString(array));
		System.out.println("Name Sort: " + Arrays.toString(arr));
		ArrayList<String> al = new ArrayList<String>();
		al.add("ramarao");
		al.add("krishnarao");
		al.add("subbarao");
		Collections.sort(al);
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	// we have to implement comparable interface for user defined class type objects
		ArrayList<ComparableClass> ual = new ArrayList<ComparableClass>();
		ual.add(new ComparableClass(101, "vijay"));
		ual.add(new ComparableClass(102, "Ajay"));
		ual.add(new ComparableClass(103, "Jay"));
		Collections.sort(ual);
		for (ComparableClass str : ual) {
			System.out.println(str.eno + " " + str.ename);
		}
	}

	@Override
	/* String eompareTo
	 * public int compareTo(ComparableClass arg) { return
	 * ename.compareTo(arg.ename); }
	 */
	
	// int compareTo()
	public int compareTo(ComparableClass arg) {
		if (eno == arg.eno)
			return 0;
		else if (eno > arg.eno)
			return 1;
		else
			return -1;
	}

}
