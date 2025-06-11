
public class QuadraticTimeExample {

	public static void main(String[] args) {
		int[] numbers = {1,3,5,7,3};
		
		boolean hasDuplicate = false;
		
		//O(n) - Nested loop for comparing all pairs
		for(int i =0;i<numbers.length;i++) {
			for(int j =0;j<numbers.length;j++) {
				if(numbers[i] == numbers[j]) {
					hasDuplicate = true;
					System.out.println("Duplicate found: "+ numbers[i]);
				}
			}
				
		}
		if(!hasDuplicate) {
			System.out.println("No duplicates found. ");
		}

	}

}
