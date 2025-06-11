import java.util.Scanner;

public class PalindromeTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input:");
		String s = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(s);
		StringBuilder rev = sb.reverse();
		
		if(s.equals(rev.toString())) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	}

}
