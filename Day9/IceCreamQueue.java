import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class IceCreamQueue {

	public static void main(String[] args) {
		Queue<String> kid = new LinkedList<String>();
		kid.add("Krish");
		kid.add("Bunny");
		kid.add("Chintu");
		System.out.println(kid);
		
		System.out.println(kid.peek());
		
		kid.poll();
		System.out.println(kid);
		
		kid.add("Nani");
		System.out.println(kid);

	}

}
