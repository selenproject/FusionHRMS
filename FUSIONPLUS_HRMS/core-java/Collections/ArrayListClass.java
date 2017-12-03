package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("anjali");
		al.add("Yuktej");
		al.add("Srinivas");
		
		/*for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}*/
		
		for(String i:al){
			System.out.println(i);
		}
		/*Iterator itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
	}
}
