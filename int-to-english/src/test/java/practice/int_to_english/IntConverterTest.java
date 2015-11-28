package practice.int_to_english;

import static org.junit.Assert.assertTrue;

import java.security.InvalidParameterException;

import org.junit.Test;

public class IntConverterTest {

	@Test(expected = InvalidParameterException.class)
	public void testSplitOutOfRange1() {
		IntConverter.split(-1);
	}

	@Test(expected = InvalidParameterException.class)
	public void testSplitOutOfRange2() {
		IntConverter.split(Integer.MIN_VALUE);
	}

	@Test
	public void testSplitValid1() {
		assertTrue(isEqual(new int[] { 0 },
				IntConverter.split(0)));
	}

	@Test
	public void testSplitValid2() {
		assertTrue(isEqual(new int[] { 5 },
				IntConverter.split(5)));
	}

	@Test
	public void testSplitValid3() {
		assertTrue(isEqual(new int[] { 1, 2 },
				IntConverter.split(21)));
	}

	@Test
	public void testSplitValid4() {
		assertTrue(isEqual(new int[] { 5, 0, 1 },
				IntConverter.split(105)));
	}

	@Test
	public void testSplitValid5() {
		assertTrue(isEqual(new int[] { 5, 0, 0, 1 },
				IntConverter.split(1005)));
	}

	@Test
	public void testSplitValid6() {
		assertTrue(isEqual(new int[] { 2, 4, 0, 1 },
				IntConverter.split(1042)));
	}

	@Test
	public void testSplitValid7() {
		assertTrue(isEqual(new int[] { 5, 0, 1, 1 },
				IntConverter.split(1105)));
	}

	@Test
	public void testSplitValid8() {
		assertTrue(isEqual(new int[] { 1, 8, 7, 5, 4, 9, 6,
				5 }, IntConverter.split(56945781)));
	}

	@Test
	public void testSplitValid9() {
		assertTrue(isEqual(new int[] { 9, 9, 9, 9, 9, 9, 9,
				9, 9 }, IntConverter.split(999999999)));
	}

	/**
	 * Compares two int arrays, and determines whether they are equal
	 *
	 * @param expected
	 * @param actual
	 * @return
	 */
	private boolean isEqual(int[] expected, int[] actual) {

		if (expected.length != actual.length) {
			return false;
		}

		for (int i = 0; i < expected.length; i++) {
			if (expected[i] != actual[i]) {
				return false;
			}
		}

		return true;
	}
}
