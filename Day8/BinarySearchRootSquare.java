import java.util.Scanner;

public class BinarySearchRootSquare {
	  public static int sqrt(int number) {
	        if (number < 2) return number;

	        int low = 1, high = number / 2, ans = 0;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            long square = (long) mid * mid;

	            if (square == number) {
	                return mid;
	            } else if (square < number) {
	                ans = mid; 
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        return ans;
	    }

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a digit:");
		 int number = sc.nextInt();
        int result = sqrt(number);
        System.out.println("Square root (integer part) of " + number + " is " + result);
	}

}
