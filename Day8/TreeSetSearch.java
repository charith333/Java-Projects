import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetSearch {

	public static void main(String[] args) {
		TreeSet<String> products = new TreeSet<String>();
		products.add("Keyboard");
		products.add("Mouse");
		products.add("Monitor");
		products.add("CPU");
		products.add("Webcam");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a product:");
		String name = sc.nextLine();
		
		if(products.contains(name)) {
			System.out.println("The product you have entered is exists.");
		}
		else {
			System.out.println("The product doesn't exists.");
		}
		


	}

}
