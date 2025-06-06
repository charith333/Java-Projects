import java.util.Collections;
import java.util.TreeSet;

public class TreeTaskReverse {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>(Collections.reverseOrder());
		names.add("Sumit");
		names.add("Karan");
		names.add("Anjali");
		names.add("Mohan");
		names.add("Zoya");
		
		System.out.println(names);
		

	}

}
