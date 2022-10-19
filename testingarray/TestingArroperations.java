package testingarray;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestingArroperations {
	ArrOperation test = new ArrOperation();
	
	@Test
	public void test_NegativeElementsInArray() {
		int[] arr = { 1, -1, 2, 3 };
		boolean output = ArrOperation.checkArray(arr);
		assertEquals(false, output);
	}

	@Test
	public void test_ArraySizeGreaterThanOne() {
		int arr[] = { 1, 2, 3, 4, 6, 3, 2, 1 };
		int output = test.largestMirror(arr);
		assertEquals(3, output);
	}

	@Test
	public void test_Palindrome_Array() {
		int arr[] = { 1, 2, 3, 4, 3, 2, 1 };
		int output = test.largestMirror(arr);
		assertEquals(7, output);
	}

}
