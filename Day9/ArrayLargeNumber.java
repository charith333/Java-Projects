import java.util.Scanner;

public class ArrayLargeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter 5 numbers:");
		for(int i=0;i<5;i++) {
			arr [i] = sc.nextInt();
		}
		int large =arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>large) {
				large = arr[i];
			}
		}
		System.out.println("The largest number is:"+ large);
		
	}

}
