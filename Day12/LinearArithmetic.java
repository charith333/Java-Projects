import javax.sql.rowset.serial.SQLOutputImpl;

public class LinearArithmetic {
	public void merge(int[] arr,int left,int mid,int right)
	{
		int n1=mid-left+1;  
		int n2=right-mid;
		int l[]=new int[n1];
		int r[]=new int[n2];
		for(int i=0;i<n1;++i)
		{
			l[i]=arr[left+i];
			
		}
		for(int j=0;j<n2;++j)
		{
			r[j]=arr[mid+1+j];
		}
		int i=0,j=0;
		int k=left;
		while(i<n1 && j<n2)
		{
			if(l[i]<=r[j])
			{
				arr[k]=l[i];
				i++;
			}
			else
			{
				arr[k]=r[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			arr[k]=l[i];
			i++;
			k++;
		}
	}
	void sort(int arr[],int left,int right)
	{
		if(left<right)
		{
			int mid=(left+right)/2;
			sort(arr,left,mid);
			sort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}
	static void printArray(int arr[])
	{
		for(int num:arr)
		{
			System.out.println(num+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {12,11,13,6,7};
		System.out.println("Original Array:");
		printArray(arr);
		
		LinearArithmetic ob = new LinearArithmetic();
		ob.sort(arr, 0, arr.length-1);
		
		System.out.println("Sorted Array:");
		printArray(arr);
		}

	}


