import java.util.HashMap;

public class GroceryBasketHashMap {

	public static void main(String[] args) {
		HashMap<String , Integer> basket = new HashMap<>();
		
		basket.put("Apples", 50);
		basket.put("Bannanas", 60);
		basket.put("Mangoes", 70);
		basket.put("Oranges", 90);
		basket.put("Guavas", 40);
		System.out.println(basket);
		
		basket.replace("Apples", 100);
		basket.remove("Guavas");
		System.out.println(basket);
		
		int total =0;
		for(int i : basket.values()) {
			 total += i;	
		}
		System.out.println("Total price:"+ total);
		

	}

}
