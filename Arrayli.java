package JavaProgram;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
public class Arrayli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<Integer> al=new ArrayList<>();
		al.add(2);
		al.add(4);
		al.add(5);
		al.add(2);
		al.add(null);
		al.add(0,1);
		al.set(0, 100);
		System.out.println(al);
		ArrayList li=new ArrayList<>();
		li.add(2);
		li.add('A');
		li.add("hii");
		li.addAll(al);
	
		System.out.println(li);
		System.out.println(li.get(2));
		System.out.println(li.size());
		System.out.println(li.contains("hii"));
		li.remove(0);
		System.out.println(li);
		System.out.println("al values" + al);
		System.out.println("li values" + li);
		//li.removeAll(al);
		//System.out.println("li values"+ li);
		li.retainAll(al);
		System.out.println("li values"+li);
		li.clear();
		System.out.println(li);
		System.out.println(li.isEmpty());
		System.out.println(al.indexOf(null));
		Object ar[]=al.toArray();
		System.out.println(Arrays.toString(ar));*/
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(20);
		ll.add(40);
		ll.add(60);
		ll.addFirst(10);
		ll.addLast(70);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
//		for(int i=0;i<ll.size();i++)
//		{
//			System.out.println(ll.get(i));
//		}
//		for(int a:ll)
//		{
//			System.out.println(a);
//		}
		
//		Iterator i=ll.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		ListIterator i2=ll.listIterator();
		while(i2.hasNext())
		{
			i2.next();
		}
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
		
		
		Stack<String> s=new Stack<>();
		s.push("hii");
		s.push("hello");
		s.push("hey");
		s.push("you");
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.search("hii"));
		System.out.println(s);
		for(int i=0;i<s.size();i++)
		{
			System.out.println(s.get(i));
		}
		
	}

}
