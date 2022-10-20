package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SearchTest {

	@Test
	public void linearSeacrhTest() {
		int[] arr = { 5, 2, 3, 1, 4 };
		int left = 0;
		int index = Search.linearSearch(arr,4,left);
		assertEquals(4, index);

	}

	@Test
	public void binarySeacrhTest() {
		int[] arr = {1,2,3,4,5,6 };
		int left = 0;
		int right = arr.length;
		int index = Search.binarySearch(arr,4,left, right);
		assertEquals(3, index);

	}

}
