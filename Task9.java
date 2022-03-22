package Task;
import java.util.*;

public class Task9 {
	
	public static void main(String[] args) {
		
        LinkedList<String> movie2 = new LinkedList<String>();
	    movie2.add("Purni");
	    movie2.add("Anu");
	    movie2.add("Laya");
	    movie2.add("Valli");
        System.out.println(" Using Listiterator ");
	    ListIterator<String> mve = movie2.listIterator(movie2.size());
	    while (mve.hasPrevious()) {
	    	 
	         String obj=mve.previous();
	         System.out.println(obj);
	}
	         System.out.println(" Using iterator ");
	         Iterator<String> itr = movie2.iterator();
	         while(itr.hasNext()) {
	            System.out.println(itr.next());
	}
}
}
