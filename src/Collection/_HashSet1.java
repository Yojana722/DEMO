package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class _HashSet1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("rahul");
		al.add(100);
		al.add('B');
		al.add(null);
		al.add(100);
		al.add("ganesh");
		al.add('A');
		
		System.out.println(al);
		
		HashSet hs = new HashSet(al);
		System.out.println(hs);
		
		
	}
}
