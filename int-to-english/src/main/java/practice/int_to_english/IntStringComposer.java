package practice.int_to_english;

public class IntStringComposer {

	// unit tested by IntToEnglishTest.java

	private static final String[] NOUGHTS = { "zero",
		"one", "two", "three", "four", "five", "six",
		"seven", "eight", "nine" };
	private static final String[] TEENS = { "ten",
		"eleven", "twelve", "thirteen", "fourteen",
		"fifteen", "sixteen", "seventeen", "eighteen",
	"nineteen" };
	private static final String[] TENS = { "twenty",
		"thirty", "forty", "fifty", "sixty", "seventy",
		"eighty", "ninety" };

	private static final String HUNDRED = "hundred";
	private static final String THOUSAND = "thousand";
	private static final String MILLION = "million";

	private static final int NOUGHTS_INDEX = 0;
	private static final int TENS_INDEX = 1;
	private static final int HUNDREDS_INDEX = 2;
	private static final int THOUSANDS_INDEX = 3;
	private static final int TEN_THOUSANDS_INDEX = 4;
	private static final int HUNDRED_THOUSANDS_INDEX = 5;
	private static final int MILLIONS_INDEX = 6;
	private static final int TEN_MILLIONS_INDEX = 7;
	private static final int HUNDRED_MILLIONS_INDEX = 8;

	/**
	 * Converts an inverted array of int into an English language String
	 * equivalent value
	 *
	 * @param split
	 * @return
	 */
	protected static String getIntString(int[] split) {
		switch (split.length) {

		case 1: // e.g. 1
			return getNoughtsString(split);
		case 2: // e.g. 10
			return getTensString(split);
		case 3: // e.g. 100
			return getHundredsString(split);
		case 4: // e.g. 100
		case 5: // e.g. 10'000
		case 6: // e.g. 100'000
			return getThousandsString(split);
		case 7: // e.g. 1'000'000
		case 8: // e.g. 10'000'000
		case 9: // e.g. 100'000'000
			return getMillions(split);
		default:
			// this should never happen
			throw new RuntimeException(
					"critical error - array exceeds expected length");
		}
	}

	/**
	 * Returns hundreds, tens and noughts of millions
	 *
	 * @param split
	 * @return
	 */
	private static String getMillions(int[] split) {

		final StringBuilder millionsValue = new StringBuilder();

		if (split.length >= HUNDRED_MILLIONS_INDEX + 1
				&& split[HUNDRED_MILLIONS_INDEX] != 0) {
			final int[] hundreds = new int[] {
					split[MILLIONS_INDEX],
					split[TEN_MILLIONS_INDEX],
					split[HUNDRED_MILLIONS_INDEX] };
			millionsValue
			.append(getHundredsString(hundreds));
		} else if (split.length >= TEN_MILLIONS_INDEX + 1
				&& split[TEN_MILLIONS_INDEX] != 0) {
			final int[] tens = new int[] {
					split[MILLIONS_INDEX],
					split[TEN_MILLIONS_INDEX] };
			millionsValue.append(getTensString(tens));
		} else {
			millionsValue
			.append(NOUGHTS[split[MILLIONS_INDEX]]);
		}

		millionsValue.append(" ");
		millionsValue.append(MILLION);

		appendRestOfThousands(split, millionsValue);

		return millionsValue.toString();
	}

	/**
	 * Returns the remainder of thousands, to be included in greater number
	 * ranges
	 *
	 * @param split
	 * @param millionsValue
	 */
	private static void appendRestOfThousands(int[] split,
			StringBuilder millionsValue) {
		if (split[HUNDRED_THOUSANDS_INDEX] == 0
				&& split[TEN_THOUSANDS_INDEX] == 0
				&& split[THOUSANDS_INDEX] == 0) {

			appendRestOfHundreds(split, millionsValue);
		} else {

			millionsValue.append(" ");
			millionsValue.append(getThousandsString(split));

		}
	}

	/**
	 * Returns hundreds, tens and noughts of thousands
	 *
	 * @param split
	 */
	private static String getThousandsString(int[] split) {

		final StringBuilder thousandsValue = new StringBuilder();

		if (split.length >= HUNDRED_THOUSANDS_INDEX + 1
				&& split[HUNDRED_THOUSANDS_INDEX] != 0) {
			final int[] hundreds = new int[] {
					split[THOUSANDS_INDEX],
					split[TEN_THOUSANDS_INDEX],
					split[HUNDRED_THOUSANDS_INDEX] };
			thousandsValue
			.append(getHundredsString(hundreds));
		} else if (split.length >= TEN_THOUSANDS_INDEX + 1
				&& split[TEN_THOUSANDS_INDEX] != 0) {
			final int[] tens = new int[] {
					split[THOUSANDS_INDEX],
					split[TEN_THOUSANDS_INDEX] };
			thousandsValue.append(getTensString(tens));
		} else {
			thousandsValue
			.append(NOUGHTS[split[THOUSANDS_INDEX]]);
		}

		thousandsValue.append(" ");
		thousandsValue.append(THOUSAND);

		// thousands doesn't know if it is getting hundreds or tens

		appendRestOfHundreds(split, thousandsValue);

		return thousandsValue.toString();
	}

	/**
	 * Returns the remainder of hundreds, to be included in greater number
	 * ranges
	 *
	 * @param split
	 * @param thousandsValue
	 */
	private static void appendRestOfHundreds(int[] split,
			StringBuilder thousandsValue) {
		if (split[HUNDREDS_INDEX] != 0) {
			thousandsValue.append(" ");
			thousandsValue.append(getHundredsString(split));
		} else {

			final String tens = getTensString(split);

			if (!tens.isEmpty()) {
				thousandsValue.append(" and ");
				thousandsValue.append(tens);
			}
		}
	}

	/**
	 * Returns hundreds
	 *
	 * @param split
	 * @return
	 */
	private static String getHundredsString(int[] split) {

		final StringBuilder hundredsValue = new StringBuilder();
		hundredsValue
		.append(NOUGHTS[split[HUNDREDS_INDEX]]);
		hundredsValue.append(" ");
		hundredsValue.append(HUNDRED);

		final String tens = getTensString(split);

		if (!tens.isEmpty()) {
			hundredsValue.append(" and ");
			hundredsValue.append(tens);
		}

		return hundredsValue.toString();
	}

	/**
	 * Returns tens
	 *
	 * @param split
	 * @return
	 */
	private static String getTensString(int[] split) {

		if (split[TENS_INDEX] == 0) {
			return getNoughtsString(split);
		}

		if (split[TENS_INDEX] < 2) {
			return TEENS[split[NOUGHTS_INDEX]];
		} else {
			final StringBuilder tensValue = new StringBuilder();
			tensValue.append(TENS[split[TENS_INDEX] - 2]);
			// subtract two,
			// since tens[0] ==
			// twenty etc
			tensValue.append(" ");
			tensValue.append(getNoughtsString(split));
			return tensValue.toString().trim();
		}
	}

	/**
	 * Returns noughts (i.e. units)
	 *
	 * @param split
	 * @return
	 */
	private static String getNoughtsString(int[] split) {

		if (split[NOUGHTS_INDEX] == 0) {
			return "";
		}

		return NOUGHTS[split[NOUGHTS_INDEX]];
	}

	/**
	 * Returns zero
	 *
	 * @return
	 */
	protected static String getZero() {
		return NOUGHTS[0];
	}
}
