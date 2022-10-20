package recursion;

public class Search {
	public static int linearSearch(int[] arr, int left, int right,int ele) {

		if (right < left) 
			return -1;

		if (arr[left] == ele) 
			return left;

		if (arr[right] == ele) 
			return right;

		return linearSearch(arr, left + 1, right - 1, ele);
		
	}

	public static int binarySearch(int[] arr, int left, int right,int ele) {
		
		if (right >= left) {
			int mid = left + (right - left) / 2;


			if (arr[mid] == ele)
				return mid;

			
			if (arr[mid] > ele)
				return binarySearch(arr, left, mid - 1, ele);

			return binarySearch(arr, mid + 1, right, ele);
		}

		return -1;
	}
	
	public static void main(String args[]) {
		int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
		int left = 0;
		int right = arr.length-1;
		int ele = 101;
		System.out.println(linearSearch(arr,left,right,ele));
		System.out.println(binarySearch(arr,left,right,ele));
	}




}
