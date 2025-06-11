
public class ConstantTimeExample {
	//Method that demonstrates O(1) time complexity
	public static void printFirstElement(int[] arr) {
		if(arr.length > 0) {
			System.out.println("First element is: " + arr[0]);
		}
		else {
			System.out.println("Array is empty.");
		}
	}
	public static void main(String[] args) {
		//Example Array
		int[] numbers = {10,20,30,40,50,60,70,80,90,100};
		
		
		//calling the O(1) method
		printFirstElement(numbers);

	}

}
