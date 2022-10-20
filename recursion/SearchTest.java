package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SearchTest {

	@Test
	public void linearSeacrhTest() {
		int[] arr = { 5, 2, 3, 1, 4 };
		int left = 0;
		int right = arr.length-1;
		int index = Search.linearSearch(arr, left,right, 4);
		assertEquals(4, index);
		index = Search.linearSearch(arr, left,right, 50);
		assertEquals(-1, index);
	}

	@Test
	public void binarySeacrhTest() {
		int[] arr = { 5, 2, 3, 1, 4 };
		int left = 0;
		int right = arr.length-1;
		int index = Search.binarySearch(arr,left, right, 4);
		assertEquals(4, index);
		index = Search.binarySearch(arr, left,right, 50);
		assertEquals(-1, index);
	}

}
