package Quicksort;

public class QuickSort {
	int partition(int arr[],int start,int last)
	{
		int j;
		int pivot=arr[last];
		int i=(start-1);
		for(j=start;j<last;j++)
		{
		if(arr[j]<=pivot)
		{
			i++;
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[last];
		arr[last]=temp;
		return (i+1);
	}
	void sort(int arr[],int start,int last)
	{
		if(start<last)
		{
			int pi=partition(arr, start, last);
			sort(arr, start, pi-1);
			sort(arr, pi+1, last);
			
		}
	}
	static void printArray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;++i)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,5,7,8,9,0,2,6};
		int n=arr.length;
		QuickSort q=new QuickSort();
		q.sort(arr, 0, n-1);
		System.out.println("Sorted Array");
		printArray(arr);
	}
}
