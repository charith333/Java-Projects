import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchSortedArray {

	public static void main(String[] args) {
		String[] names = {"Amit", "Divya", "Karan", "Priya", "Zoya"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name:");
		String name = sc.nextLine();
		
		int index = Arrays.binarySearch(names, name);
		 if (index >= 0) {
	            System.out.println("Name Exists.");
	        } else {
	            System.out.println("Name doesn't Exists.");
	        }
		
	}

}
