package testingarray;

import java.util.Scanner;

public class ArrOperation {
	Scanner in = new Scanner(System.in);
	int[] arr;
	int noOfItems;
	public static boolean checkArray(int[] arr) {
		boolean correct = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				correct = false;
				break;
			}
		}
		return correct;
	}

	public void init() {
		System.out.println("Enter number of elements: ");
		noOfItems = in.nextInt();
		System.out.println("Enter " + noOfItems + " elements: ");
		arr = new int[noOfItems];
		for (int i = 0; i < noOfItems; i++) {
			arr[i] = in.nextInt();
		}
	}

	// display array
	public void displayArray(int arr[]) {
		System.out.println("Array elements: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// largest mirror
//	public int largestMirror(int[] arr) {
//		if (arr.length == 0) {
//			throw new AssertionError("Array is empty");
//		}
//		int max = 0;
//		for (int i = 0; i < arr.length; i++) {
//			int count = 0;
//			for (int j = arr.length - 1; j >= 0 && i + count < arr.length; j--) {
//				if (arr[i + count] == arr[j]) {
//					count++;
//				} else {
//					max = Math.max(max, count);
//					count = 0;
//				}
//			}
//
//			max = Math.max(max, count);
//		}
//
//		return max;
//	}

	public int largestMirror(int[] arr) {
		if (arr.length == 0) {
			throw new AssertionError("Array is empty");
		}
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = arr.length - 1; j >= 0 && i + count < arr.length; j--) {
				if (arr[i + count] == arr[j]) {
					count++;
				} else {
					max = Math.max(max, count);
					count = 0;
				}
			}

			max = Math.max(max, count);
		}

		return max;
	}
}