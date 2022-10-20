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
	@Test
	public void test_When_arrayHasOneElement() {
		int[] arr = { 1 };
		int output = test.noOfClumps(arr);
		assertEquals(0, output);
	}

	@Test
	public void test_When_SizeGreaterThanOne_Expected_Integer() {
		int arr[] = { 1, 1, 2, 2, 1, 1 };
		int output = test.noOfClumps(arr);
		assertEquals(3, output);
	}

	@Test
	public void test_When_AllElementsAreSame() {
		int arr[] = { 1, 1, 1, 1, 1 };
		int output = test.noOfClumps(arr);
		assertEquals(1, output);
	}
	@Test
	public void test_When_NumberOf_X_And_Y_Equal_Expected_Array() {
		int arr[] = { 5, 6, 4, 2, 4, 6, 5 };
		int expectedArray[] = { 2, 6, 4, 5, 4, 5, 6 };
		
		try {
			assertArrayEquals(expectedArray, test.fitXY(arr, 4, 5));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	@Test
	public void test_When_X_At_Last_Position() {
		try {
			int arr[] = { 1, 2, 3 };
			int expectedArray[] = {};
			try {
				assertArrayEquals(expectedArray, test.fitXY(arr, 3, 2));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (AssertionError e) {
			assertEquals("X is at last position", e.getMessage());
		}
	}
	@Test
	public void shouldReturnIndexToSplitArrayTest() {
		int elementsArray[] = { 1, 1, 1, 2, 1 };
		int resultIndex = test.SplitArray(elementsArray);

		assertEquals(3, resultIndex);
	}

	/*
	 * Test function return -1 as no index is found
	 */
	@Test
	public void shouldReturnIndexToSplitArrayTest1() {
		int elementsArray[] = { 2, 1, 1, 2, 1 };
		int resultIndex = test.SplitArray(elementsArray);

		assertEquals(-1, resultIndex);
	}
		
	

}
