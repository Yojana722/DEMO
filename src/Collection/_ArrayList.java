package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class _ArrayList 
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("yojana");
		al.add(12);
		al.add('A');
		al.add("yojana");
		al.add(null);
		al.add(null);
		System.out.println(al);
		System.out.println("Size of Array:"+al.size());
		boolean value = al.contains('A');
		System.out.println(value);
		al.add(2, "gaikwad");
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.isEmpty());
		al.remove(3);
		System.out.println(al);
		
		al.set(3, "ganesh");
		System.out.println(al);
		
		System.out.println(al.getClass());
		System.out.println(al.clone());
		
		System.out.println("---Print all info in ArrayList by using Iterator---");
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print all info in ArrayList by using ListIterator---");
		ListIterator ltr=al.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		//al.clear();
		//System.out.println(al);
	}

}
