import java.util.TreeSet;

public class TreeSetTask {

	public static void main(String[] args) {
		TreeSet<Integer> list = new TreeSet<Integer>();
		list.add(5002);
		list.add(4998);
		list.add(5005);
		list.add(4999);
		list.add(5001);
		
		System.out.println(list);
		System.out.println(list.first());
		System.out.println(list.last());
		System.out.println(list.higher(4998));
		System.out.println(list.lower(5005));
	}

}
