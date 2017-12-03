package Comarator;

import java.util.Comparator;

public class EnoComparator implements Comparator<Object> {

	@Override
	public int compare(Object arg0, Object arg1) {
		EmpClass s1 = (EmpClass) arg0;
		EmpClass s2 = (EmpClass) arg1;
		if (s1.eno == s2.eno)
			return 0;
		else if (s1.eno > s2.eno)
			return 1;
		else
			return -1;
	}

}
