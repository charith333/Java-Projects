public class InsertionSort {

	public static void insertionsort(int[] arr) {
		int n=arr.length;
		
		for(int i=1;i<n;i++) {
		int key=arr[i];
		int j=i-1;
		
		while(j>=0&&arr[j]>key) {
			arr[j+1]=arr[j];
			j=j-1;
		}
		arr[j+1]=key;
		}
	}
	public static void printArray(int[]arr) {
		for(int value:arr) {
			System.out.println(value+"");
		}
		System.out.println();	
	}
	public static void main(String[]args){
		int[] myArray= {5,3,1,4,2};
		
		System.out.println("before sorting:");
		printArray(myArray);
		
		insertionsort(myArray);
		
		System.out.println("after sorting:");
		printArray(myArray);
	}
}
	
