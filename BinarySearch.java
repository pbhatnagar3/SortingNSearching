/**
 * The following class will have two implementations of Binary Search
 * 	1. Iterative
 *  2. Recursive
 *  NOTE : it is always assumed that the input array is sorted in nature
 * @author pbhatnagar
 *
 */
public class BinarySearch {

	public Integer binarySearchIterative(int[] arr, int x){
		int low = 0;
		int high = arr.length - 1;
		while(low <= high){
			int mid = (high + low)/2;
			if(arr[mid] < x){
				low = mid + 1;
			}
			else if(arr[mid] > x){
				high = mid - 1;				
			}
			else{
				return mid;
			}
		}// end of the while loop
	
	//till now, if the element is present in sorted array, we must have found its location and have returned it.
	//if we are in this part of the code, we are guarantee that the input array does not have the element
	return null;
	}
	
	public Integer binarySearchRecursive(int[] arr, int x, int low, int high){
		if(low > high){
			return null; 
		}
		int mid = (low + high)/2;
		if(arr[mid] == x){
			return mid;
		}
		else if(arr[mid] > x){
			return binarySearchRecursive(arr, x, low, mid -1);
		}
		else{
			return binarySearchRecursive(arr, x, mid+1 , high);
		}
	}
	
	public static class tester{
		public static void main(String[] args) {
			int[] arr = {1,3,5,6,7,8};
			BinarySearch binarySearch = new BinarySearch();
			System.out.println(binarySearch.binarySearchIterative(arr, 30));
			System.out.println(binarySearch.binarySearchRecursive(arr, 3, 0, arr.length-1));
			System.out.println(binarySearch.binarySearchRecursive(arr, 36, 0, arr.length-1));
		}
	}
	
}
