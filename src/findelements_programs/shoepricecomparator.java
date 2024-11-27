package findelements_programs;

import java.util.Comparator;

public class shoepricecomparator implements Comparator<String[]> {

	public int compare(String[] s1, String[] s2) {
		int p1 = Integer.parseInt(s1[1].substring(1).replace(",", ""));
		int p2 = Integer.parseInt(s2[1].substring(1).replace(",", ""));
		if(p1>p2) 
			return 100;
		else if(p1<p2)
		    return -100;
		else
			return 0;
	}

	
}
