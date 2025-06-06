import java.util.TreeMap;

public class TreeMapCapitals {

	public static void main(String[] args) {
		TreeMap<String, String> capitallist = new TreeMap<>();
		capitallist.put("India", "New Delhi");
		capitallist.put("USA", "Washington");
		capitallist.put("German", "Berlin");
		capitallist.put("Japan", "Tokyo");
		capitallist.put("India", "Delhi");
		
		System.out.println(capitallist);
		System.out.println(capitallist.firstKey());
		System.out.println(capitallist.lastKey());
		System.out.println(capitallist.higherKey("USA"));
		System.out.println(capitallist.lowerKey("Japan"));
	}

}
