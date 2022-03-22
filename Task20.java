package Task;
/* Methods of Iterator:hasNext(),next(),remove()
Methods of ListIterator:add(E e),hasNext(),hasPrevious(),next(),nextIndex(),previous(),previousIndex(),remove(),set(E e)*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Task20{
	public static void main(String[] args) {
		//make a collection
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.remove(2);//remove()
		//get the iterator
		System.out.println("Using iterator ....");
		Iterator it=num.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Using Listitertor....");
		ListIterator obj=num.listIterator(num.size());
		while(obj.hasPrevious()) {
			Object obj1=obj.previous();
			System.out.println(obj1);	
		}
		System.out.println("----");
		num.add(6);//add method
		System.out.println(num);
	
		System.out.println("After using the set() method : ");
		for (Object item : num) {
		System.out.println(item);
	}
}
}
