package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class _LinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("ganesh");
		lhs.add('A');
		lhs.add(10);
		lhs.add("rahul");
		lhs.add(null);
		lhs.add(100);
		lhs.add("ganesh");
		lhs.add(null);
		
		System.out.println(lhs);
		System.out.println(lhs.size());   //6
		System.out.println(lhs.contains(null)); //true
		System.out.println(lhs.isEmpty()); //false
		lhs.remove(10);
		System.out.println(lhs);
		
		Iterator itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		lhs.clear();
		System.out.println(lhs);
		
	}
}
