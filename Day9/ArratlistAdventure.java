import java.util.ArrayList;

public class ArratlistAdventure {

	public static void main(String[] args) {
		ArrayList<String> cartoons = new ArrayList<>();
			cartoons.add("Chota Bheem");
			cartoons.add("Oggy and Cockroaches");
			cartoons.add("Tom and Jerry");
			cartoons.add("Shinchan");
			cartoons.add("Motu Patlu");
			
			cartoons.remove(1);
			
			cartoons[3] = "Ninja Hatori";
			
			for(String name : cartoons) {
				System.out.println(name);
			}
		
	}

}
