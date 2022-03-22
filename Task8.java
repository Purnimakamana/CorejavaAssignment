package Task;
import java.util.*;
/*Using TreeSet, make sure to add varied data types to the set including Upper and Lower case and predict your output.*/
public class Task8 {
	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		set.add("PURNI");
		set.add("Purni");
		set.add("pUrni");
		set.add("PURNI");//Duplicates are not allowed
		set.add("purni");
		System.out.println(set);
	}
}
