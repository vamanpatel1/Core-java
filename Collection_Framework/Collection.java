package in.com.Collection_Framework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Collection {
	
	public static void main(String[] args) {
		
		Stack s = new Stack ();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		/*s.pop();
		s.pop();
		*/
		System.out.println(s);
		//System.out.println(s.peek());
		//System.out.println(s.peek());
		
		Set h = new LinkedHashSet();
		h.add(6);
		h.add(76);
		h.add(10);
		h.add(97);
		h.add(100);
		
		System.out.println(h);
		
		TreeSet t = new TreeSet();
		t.add(11);
		t.add(12);
		t.add(13);
		t.add(14);
		t.add(15);
		
		System.out.println(t);
		
		PriorityQueue q = new PriorityQueue();
		q.add(16);
		q.add(17);
		q.add(18);
		q.add(19);
		q.add(20);
		
		System.out.println(q);
		System.out.println(q.poll());
		
		ArrayDeque a = new ArrayDeque();
		a.add(21);
		a.add(22);
		a.add(23);
		a.add(24);
		a.add(25);
		a.addFirst(5);
		a.addLast(2);
		
		System.out.println(a);
		
		Map m = new HashMap();
		m.put(26,"v");
		m.put(27,"p");
		m.put(28,"p");
		m.put(29,"v");
		m.put(30,"p");
		
		System.out.println(m);
		
		
		
		ArrayList c = new ArrayList();
		c.add("Vaman");
		c.add("Patel");
		
		Iterator it = c.iterator();
		c.add(it);
		while (it.hasNext()); 
		Object o = it.next();
		System.out.println(o);
		
		ArrayList v = new ArrayList();
		v.add("One");
		v.add("Two");
		v.add("Three");
		
		
		Integer i = new Integer(4);
		v.add(i);
		
		Integer value = (Integer)v.get(3);
		System.out.println(value);
	}
	}


