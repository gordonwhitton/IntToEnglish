package practice.int_to_english;

import java.security.InvalidParameterException;

import org.junit.Assert;
import org.junit.Test;

public class IntToEnglishTest {

	@Test(expected = InvalidParameterException.class)
	public void testOutOfRange1() {
		IntToEnglish.toEnglish(-1);
	}

	@Test(expected = InvalidParameterException.class)
	public void testOutOfRange2() {
		IntToEnglish.toEnglish(1000000000);
	}

	@Test(expected = InvalidParameterException.class)
	public void testOutOfRange3() {
		IntToEnglish.toEnglish(Integer.MIN_VALUE);
	}

	@Test(expected = InvalidParameterException.class)
	public void testOutOfRange4() {
		IntToEnglish.toEnglish(Integer.MAX_VALUE);
	}

	@Test
	public void testNoughts1() {
		final String expected = "zero";
		final String actual = IntToEnglish.toEnglish(0);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testNoughts2() {
		final String expected = "four";
		final String actual = IntToEnglish.toEnglish(4);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testNoughts3() {
		final String expected = "nine";
		final String actual = IntToEnglish.toEnglish(9);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTeens1() {
		final String expected = "ten";
		final String actual = IntToEnglish.toEnglish(10);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTeens2() {
		final String expected = "thirteen";
		final String actual = IntToEnglish.toEnglish(13);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTeens3() {
		final String expected = "nineteen";
		final String actual = IntToEnglish.toEnglish(19);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTens1() {
		final String expected = "twenty";
		final String actual = IntToEnglish.toEnglish(20);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTens2() {
		final String expected = "twenty seven";
		final String actual = IntToEnglish.toEnglish(27);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTens3() {
		final String expected = "thirty one";
		final String actual = IntToEnglish.toEnglish(31);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTens4() {
		final String expected = "forty nine";
		final String actual = IntToEnglish.toEnglish(49);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTens5() {
		final String expected = "seventy five";
		final String actual = IntToEnglish.toEnglish(75);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTens6() {
		final String expected = "ninety eight";
		final String actual = IntToEnglish.toEnglish(98);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTens7() {
		final String expected = "sixty";
		final String actual = IntToEnglish.toEnglish(60);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundreds1() {
		final String expected = "one hundred";
		final String actual = IntToEnglish.toEnglish(100);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundreds2() {
		final String expected = "one hundred and one";
		final String actual = IntToEnglish.toEnglish(101);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundreds3() {
		final String expected = "one hundred and two";
		final String actual = IntToEnglish.toEnglish(102);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundreds4() {
		final String expected = "one hundred and two";
		final String actual = IntToEnglish.toEnglish(102);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundreds5() {
		final String expected = "one hundred and nineteen";
		final String actual = IntToEnglish.toEnglish(119);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundreds6() {
		final String expected = "one hundred and twenty";
		final String actual = IntToEnglish.toEnglish(120);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundreds7() {
		final String expected = "one hundred and twenty one";
		final String actual = IntToEnglish.toEnglish(121);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundreds8() {
		final String expected = "one hundred and ninety seven";
		final String actual = IntToEnglish.toEnglish(197);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundreds9() {
		final String expected = "two hundred";
		final String actual = IntToEnglish.toEnglish(200);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundreds10() {
		final String expected = "two hundred and fifteen";
		final String actual = IntToEnglish.toEnglish(215);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundreds11() {
		final String expected = "two hundred and twenty six";
		final String actual = IntToEnglish.toEnglish(226);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundreds12() {
		final String expected = "three hundred and sixty six";
		final String actual = IntToEnglish.toEnglish(366);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundreds13() {
		final String expected = "four hundred and fifty four";
		final String actual = IntToEnglish.toEnglish(454);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundreds14() {
		final String expected = "six hundred and seventy";
		final String actual = IntToEnglish.toEnglish(670);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundreds15() {
		final String expected = "eight hundred and nine";
		final String actual = IntToEnglish.toEnglish(809);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundreds16() {
		final String expected = "nine hundred and fifty two";
		final String actual = IntToEnglish.toEnglish(952);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundreds17() {
		final String expected = "nine hundred and ninety nine";
		final String actual = IntToEnglish.toEnglish(999);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testThousands1() {
		final String expected = "one thousand";
		final String actual = IntToEnglish.toEnglish(1000);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testThousands2() {
		final String expected = "one thousand and one";
		final String actual = IntToEnglish.toEnglish(1001);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testThousands3() {
		final String expected = "one thousand and fourteen";
		final String actual = IntToEnglish.toEnglish(1014);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testThousands4() {
		final String expected = "one thousand and fifty nine";
		final String actual = IntToEnglish.toEnglish(1059);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testThousands5() {
		final String expected = "one thousand one hundred and three";
		final String actual = IntToEnglish.toEnglish(1103);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testThousands6() {
		final String expected = "one thousand four hundred and ninety one";
		final String actual = IntToEnglish.toEnglish(1491);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testThousands7() {
		final String expected = "four thousand six hundred and six";
		final String actual = IntToEnglish.toEnglish(4606);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testThousands8() {
		final String expected = "six thousand and ninety nine";
		final String actual = IntToEnglish.toEnglish(6099);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testThousands9() {
		final String expected = "nine thousand three hundred and seventy six";
		final String actual = IntToEnglish.toEnglish(9376);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTenThousands1() {
		final String expected = "ten thousand";
		final String actual = IntToEnglish.toEnglish(10000);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTenThousands2() {
		final String expected = "eleven thousand and four";
		final String actual = IntToEnglish.toEnglish(11004);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTenThousands3() {
		final String expected = "fourteen thousand three hundred and fifty two";
		final String actual = IntToEnglish.toEnglish(14352);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTenThousands4() {
		final String expected = "thirty thousand six hundred and eleven";
		final String actual = IntToEnglish.toEnglish(30611);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTenThousands5() {
		final String expected = "sixty two thousand and forty five";
		final String actual = IntToEnglish.toEnglish(62045);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTenThousands6() {
		final String expected = "seventy nine thousand seven hundred and sixty four";
		final String actual = IntToEnglish.toEnglish(79764);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTenThousands7() {
		final String expected = "ninety six thousand one hundred and four";
		final String actual = IntToEnglish.toEnglish(96104);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundredThousands1() {
		final String expected = "one hundred thousand";
		final String actual = IntToEnglish
				.toEnglish(100000);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundredThousands2() {
		final String expected = "one hundred and eleven thousand and four";
		final String actual = IntToEnglish
				.toEnglish(111004);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundredThousands3() {
		final String expected = "two hundred and fourteen thousand three hundred and fifty two";
		final String actual = IntToEnglish
				.toEnglish(214352);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundredThousands4() {
		final String expected = "four hundred and thirty thousand six hundred and eleven";
		final String actual = IntToEnglish
				.toEnglish(430611);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundredThousands5() {
		final String expected = "five hundred and sixty two thousand and forty five";
		final String actual = IntToEnglish
				.toEnglish(562045);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundredThousands6() {
		final String expected = "six hundred and seventy nine thousand seven hundred and sixty four";
		final String actual = IntToEnglish
				.toEnglish(679764);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundredThousands7() {
		final String expected = "eight hundred and ninety six thousand one hundred and four";
		final String actual = IntToEnglish
				.toEnglish(896104);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testMillion1() {
		final String expected = "one million";
		final String actual = IntToEnglish
				.toEnglish(1000000);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testMillion2() {
		final String expected = "one million one hundred and eleven thousand and four";
		final String actual = IntToEnglish
				.toEnglish(1111004);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testMillion3() {
		final String expected = "two million two hundred and fourteen thousand three hundred and fifty two";
		final String actual = IntToEnglish
				.toEnglish(2214352);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testMillion4() {
		final String expected = "three million four hundred and thirty thousand six hundred and eleven";
		final String actual = IntToEnglish
				.toEnglish(3430611);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testMillion5() {
		final String expected = "four million five hundred and sixty two thousand and forty five";
		final String actual = IntToEnglish
				.toEnglish(4562045);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testMillion6() {
		final String expected = "five million six hundred and seventy nine thousand seven hundred and sixty four";
		final String actual = IntToEnglish
				.toEnglish(5679764);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testMillion7() {
		final String expected = "nine million eight hundred and ninety six thousand one hundred and four";
		final String actual = IntToEnglish
				.toEnglish(9896104);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTenMillion1() {
		final String expected = "ten million";
		final String actual = IntToEnglish
				.toEnglish(10000000);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTenMillion2() {
		final String expected = "eleven million one hundred and eleven thousand and four";
		final String actual = IntToEnglish
				.toEnglish(11111004);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTenMillion3() {
		final String expected = "fifteen million two hundred and fourteen thousand three hundred and fifty two";
		final String actual = IntToEnglish
				.toEnglish(15214352);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTenMillion4() {
		final String expected = "forty three million four hundred and thirty thousand six hundred and eleven";
		final String actual = IntToEnglish
				.toEnglish(43430611);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTenMillion5() {
		final String expected = "fifty four million five hundred and sixty two thousand and forty five";
		final String actual = IntToEnglish
				.toEnglish(54562045);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTenMillion6() {
		final String expected = "sixty five million six hundred and seventy nine thousand seven hundred and sixty four";
		final String actual = IntToEnglish
				.toEnglish(65679764);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTenMillion7() {
		final String expected = "seventy nine million eight hundred and ninety six thousand one hundred and four";
		final String actual = IntToEnglish
				.toEnglish(79896104);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testTenMillion8() {
		final String expected = "fifty six million nine hundred and forty five thousand seven hundred and eighty one";
		final String actual = IntToEnglish
				.toEnglish(56945781);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundredMillion1() {
		final String expected = "one hundred million";
		final String actual = IntToEnglish
				.toEnglish(100000000);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundredMillion2() {
		final String expected = "two hundred and eleven million one hundred and eleven thousand and four";
		final String actual = IntToEnglish
				.toEnglish(211111004);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundredMillion3() {
		final String expected = "three hundred and fifteen million two hundred and fourteen thousand three hundred and fifty two";
		final String actual = IntToEnglish
				.toEnglish(315214352);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundredMillion4() {
		final String expected = "six hundred and forty three million four hundred and thirty thousand six hundred and eleven";
		final String actual = IntToEnglish
				.toEnglish(643430611);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundredMillion5() {
		final String expected = "seven hundred and fifty four million five hundred and sixty two thousand and forty five";
		final String actual = IntToEnglish
				.toEnglish(754562045);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundredMillion6() {
		final String expected = "eight hundred and sixty five million six hundred and seventy nine thousand seven hundred and sixty four";
		final String actual = IntToEnglish
				.toEnglish(865679764);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundredMillion7() {
		final String expected = "nine hundred and seventy nine million eight hundred and ninety six thousand one hundred and four";
		final String actual = IntToEnglish
				.toEnglish(979896104);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundredMillion8() {
		final String expected = "nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine";
		final String actual = IntToEnglish
				.toEnglish(999999999);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundredMillion9() {
		final String expected = "one hundred million and one";
		final String actual = IntToEnglish
				.toEnglish(100000001);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundredMillion10() {
		final String expected = "two hundred million two hundred";
		final String actual = IntToEnglish
				.toEnglish(200000200);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundredMillion11() {
		final String expected = "three hundred million four thousand and two";
		final String actual = IntToEnglish
				.toEnglish(300004002);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundredMillion12() {
		final String expected = "six hundred and four million and twelve";
		final String actual = IntToEnglish
				.toEnglish(604000012);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}

	@Test
	public void testHundredMillion13() {
		final String expected = "eight hundred and eighty million three hundred and twelve thousand and six";
		final String actual = IntToEnglish
				.toEnglish(880312006);
		final String errorMessage = "expected : "
				+ expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage,
				actual.contentEquals(expected));
	}
}
