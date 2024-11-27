package findelements_programs;

import java.util.Comparator;

	public class shoetitlecomparator implements Comparator<String[]> {

		public int compare(String[] s1, String[] s2) {
			return s1[1].compareTo(s2[1]);
		}
}
