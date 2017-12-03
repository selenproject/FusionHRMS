package Comarator;

import java.util.ArrayList;
import java.util.Collections;

public class EmpClass {

	int eno;
	String ename;
	float esal;

	EmpClass(int eno, String ename, float esal) {
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
	}

	public static void main(String[] args) {
		ArrayList<EmpClass> al = new ArrayList<EmpClass>();
		al.add(new EmpClass(101, "Vijay", 3000f));
		al.add(new EmpClass(102, "Ajay", 2000f));
		al.add(new EmpClass(103, "Jay", 1000f));
		Collections.sort(al, new EnameComapator());
		for(EmpClass f:al){
			System.out.println(f.eno+" "+f.ename+" "+f.esal);
		}
	}
}
