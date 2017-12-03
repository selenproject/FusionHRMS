package Comarator;

import java.util.Comparator;

public class EsalComparator implements Comparator<Object> {

	@Override
	public int compare(Object arg0, Object arg1) {
		EmpClass e1 = (EmpClass) arg0;
		EmpClass e2 = (EmpClass) arg1;
		if (e1.esal == e2.esal)
			return 0;
		else if (e1.esal > e2.esal)
			return 1;
		else
			return -1;
	}

}
