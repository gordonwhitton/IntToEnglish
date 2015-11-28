package practice.int_to_english;

import java.util.Scanner;

/*
 * A console application to demonstrate the functionality of IntConverter
 */
public class IntToEnglishConsole {

	public static void main(String[] args) {

		final Scanner sc = new Scanner(System.in);

		while (true) {

			final String valueString = sc.next();

			if (valueString.contentEquals("exit")) {
				break;
			}

			// only look at the first argument
			try {
				final int value = Integer
						.parseInt(valueString);
				final String result = IntToEnglish
						.toEnglish(value);
				System.out.print(result + '\n');
			} catch (final NumberFormatException e) {
				System.out
				.print("value must be an integer between 0 and 999'999'999" + '\n');
			}
		}

		sc.close();
	}
}
