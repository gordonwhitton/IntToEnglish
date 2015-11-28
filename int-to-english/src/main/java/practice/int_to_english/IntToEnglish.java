package practice.int_to_english;

import java.security.InvalidParameterException;

public class IntToEnglish {

	private static final int MAX_VALUE = 999999999;
	private static final int MIN_VALUE = 0;
	private static final int HUNDRED_MILLIONS_INDEX = 8;

	/**
	 * Converts an integer value to a String in English
	 *
	 * @param value
	 * @return
	 */
	public static String toEnglish(int value) {

		if (value < MIN_VALUE) {
			throw new InvalidParameterException(
					"value must be greater than or equal to zero");
		}

		if (value > MAX_VALUE) {
			throw new InvalidParameterException(
					String.format("value %s exceeds limit",
							MIN_VALUE));
		}

		// special case - handle differently as it makes remainder of task
		// simpler
		if (value == 0) {
			return IntStringComposer.getZero();
		}

		final int[] split = IntConverter.split(value);

		assert split.length != 0 : "should not be zero";
		assert split.length <= HUNDRED_MILLIONS_INDEX + 1 : "exceeds limit";

		return IntStringComposer.getIntString(split);
	}
}