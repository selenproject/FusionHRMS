package Comarator;

import java.util.Comparator;

public class EnameComapator implements Comparator<Object>{

	@Override
	public int compare(Object arg0, Object arg1) {
		EmpClass e1 = (EmpClass)arg0;
		EmpClass e2 = (EmpClass)arg1;
		return e1.ename.compareTo(e2.ename);
	}

}
