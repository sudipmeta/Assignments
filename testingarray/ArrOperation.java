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
	public int[] fitXY(int[] arr, int x, int y) throws Exception {
		noOfItems = arr.length;
		int countX = 0, countY = 0, len = arr.length;
		// array empty
		if (arr.length == 0) {
			throw new AssertionError("Array is empty");
		}
		// X at last
		if (arr[(noOfItems - 1)] == x) {
			throw new Exception("X is at last position");
		}
		// repeated x
		for (int i = 0; i < len - 1; i++) {
			if (arr[i] == x && arr[i + 1] == x) {
				throw new Exception("Adjacent X values present");
			}
		}

		for (int i = 0; i < len; i++) {
			if (arr[i] == x) {
				countX++;
			}
			if (arr[i] == y) {
				countY++;
			}
		}
		if (countY < countX) {
			throw new AssertionError(
					"X and Y count not equal or count of X is less than Y");
		}
		int[] indexX = new int[countX];
		int[] indexY = new int[countY];

		int j = 0, k = 0;
		for (int i = 0; i < len; i++) {
			if (arr[i] == x) {
				indexX[j++] = i + 1;
			}
			if (arr[i] == y) {
				indexY[k++] = i;
			}
		}
		int temp = 0;
		for (int i = 0; i < countX; i++) {
			temp = arr[indexX[i]];
			arr[indexX[i]] = arr[indexY[i]];
			arr[indexY[i]] = temp;
		}
		return arr;
	}
	public int noOfClumps(int[] arr) {
		if (arr.length == 0) {
			throw new AssertionError("Array is empty");
		}
		noOfItems = arr.length;

		int clumps = 0, count = 1;
		for (int i = 0; i < noOfItems - 1; i++) {
			if (arr[i + 1] == arr[i]) {
				count++;
			} else {
				if (count >= 2) {
					clumps++;
				}
				count = 1;
			}
		}
		if (count >= 2) {
			clumps++;
		}
		return clumps;
	}
	

	public int SplitArray(int[] arr){
		if(arr.length == 0)
    	{
    		throw new AssertionError("Array is Empty!");
    	}
    	else
    	{
	        int leftSum = 0; //sum of element of one split
	        int rightSum = 0; //sum of elements of other split
	        int index = -1; //index where array is split
	        for (int i = 0; i < arr.length; i++) {
	            leftSum += arr[i];
	            for (int j = i + 1; j < arr.length; j++) {
	                rightSum += arr[j];
	            }
	
	            if (leftSum == rightSum) {
	                index = i + 1;
	                break;
	            } else {
	                rightSum = 0;
	                continue;
	            }
	        }
	        return index;
    	}
	}
	}
	

