package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LcmGcdTest {

	@Test
	public void testLCM() {

		int lcmval = LcmGcd.lcm(2, 4);
		assertEquals(4, lcmval);
	}
	@Test
	public void testHCF() {

		int hcfval = LcmGcd.hcf(2,4);
		assertEquals(2, hcfval);
	}

}
