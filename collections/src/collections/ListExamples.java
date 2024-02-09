package collections;

import java.util.*;

public class ListExamples {

	public static void main(String[] args) {
		List<String> lst=new ArrayList<>();
		lst.add("ram");
		lst.add("shyam");
		lst.add("radha");
		lst.add("mohan");
		System.out.println(lst);
		for(String itr:lst)
		{
			System.out.println(itr);
		}
		ListIterator<String> abc = lst.listIterator(lst.size());
		while (abc.hasPrevious()) {
		    String previous = abc.previous();
		    System.out.println(previous);
	}

	}
}
