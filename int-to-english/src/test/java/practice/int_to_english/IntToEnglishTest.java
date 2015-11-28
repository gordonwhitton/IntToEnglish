package practice.int_to_english;

import java.security.InvalidParameterException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class IntToEnglishTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=InvalidParameterException.class)
	public void testOutOfRange1() {
		IntToEnglish.toEnglish(-1);
	}
	
	@Test(expected=InvalidParameterException.class)
	public void testOutOfRange2() {
		IntToEnglish.toEnglish(1000000000);
	}
	
	@Test(expected=InvalidParameterException.class)
	public void testOutOfRange3() {
		IntToEnglish.toEnglish(Integer.MIN_VALUE);
	}
	
	@Test(expected=InvalidParameterException.class)
	public void testOutOfRange4() {
		IntToEnglish.toEnglish(Integer.MAX_VALUE);
	}
	
	@Test
	public void testNoughts1() {
		String expected = "zero";
		String actual = IntToEnglish.toEnglish(0);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testNoughts2() {
		String expected = "four";
		String actual = IntToEnglish.toEnglish(4);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testNoughts3() {
		String expected = "nine";
		String actual = IntToEnglish.toEnglish(9);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testTeens1() {
		String expected = "ten";
		String actual = IntToEnglish.toEnglish(10);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testTeens2() {
		String expected = "thirteen";
		String actual = IntToEnglish.toEnglish(13);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testTeens3() {
		String expected = "nineteen";
		String actual = IntToEnglish.toEnglish(19);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	
	@Test
	public void testTens1() {
		String expected = "twenty";
		String actual = IntToEnglish.toEnglish(20);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testTens2() {
		String expected = "twenty seven";
		String actual = IntToEnglish.toEnglish(27);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testTens3() {
		String expected = "thirty one";
		String actual = IntToEnglish.toEnglish(31);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testTens4() {
		String expected = "forty nine";
		String actual = IntToEnglish.toEnglish(49);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testTens5() {
		String expected = "seventy five";
		String actual = IntToEnglish.toEnglish(75);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testTens6() {
		String expected = "ninety eight";
		String actual = IntToEnglish.toEnglish(98);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testTens7() {
		String expected = "sixty";
		String actual = IntToEnglish.toEnglish(60);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundreds1() {
		String expected = "one hundred";
		String actual = IntToEnglish.toEnglish(100);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundreds2() {
		String expected = "one hundred and one";
		String actual = IntToEnglish.toEnglish(101);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundreds3() {
		String expected = "one hundred and two";
		String actual = IntToEnglish.toEnglish(102);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundreds4() {
		String expected = "one hundred and two";
		String actual = IntToEnglish.toEnglish(102);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundreds5() {
		String expected = "one hundred and nineteen";
		String actual = IntToEnglish.toEnglish(119);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundreds6() {
		String expected = "one hundred and twenty";
		String actual = IntToEnglish.toEnglish(120);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundreds7() {
		String expected = "one hundred and twenty one";
		String actual = IntToEnglish.toEnglish(121);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundreds8() {
		String expected = "one hundred and ninety seven";
		String actual = IntToEnglish.toEnglish(197);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundreds9() {
		String expected = "two hundred";
		String actual = IntToEnglish.toEnglish(200);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundreds10() {
		String expected = "two hundred and fifteen";
		String actual = IntToEnglish.toEnglish(215);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundreds11() {
		String expected = "two hundred and twenty six";
		String actual = IntToEnglish.toEnglish(226);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundreds12() {
		String expected = "three hundred and sixty six";
		String actual = IntToEnglish.toEnglish(366);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundreds13() {
		String expected = "four hundred and fifty four";
		String actual = IntToEnglish.toEnglish(454);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundreds14() {
		String expected = "six hundred and seventy";
		String actual = IntToEnglish.toEnglish(670);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundreds15() {
		String expected = "eight hundred and nine";
		String actual = IntToEnglish.toEnglish(809);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundreds16() {
		String expected = "nine hundred and fifty two";
		String actual = IntToEnglish.toEnglish(952);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundreds17() {
		String expected = "nine hundred and ninety nine";
		String actual = IntToEnglish.toEnglish(999);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testThousands1() {
		String expected = "one thousand";
		String actual = IntToEnglish.toEnglish(1000);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testThousands2() {
		String expected = "one thousand and one";
		String actual = IntToEnglish.toEnglish(1001);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testThousands3() {
		String expected = "one thousand and fourteen";
		String actual = IntToEnglish.toEnglish(1014);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testThousands4() {
		String expected = "one thousand and fifty nine";
		String actual = IntToEnglish.toEnglish(1059);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testThousands5() {
		String expected = "one thousand one hundred and three";
		String actual = IntToEnglish.toEnglish(1103);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testThousands6() {
		String expected = "one thousand four hundred and ninety one";
		String actual = IntToEnglish.toEnglish(1491);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testThousands7() {
		String expected = "four thousand six hundred and six";
		String actual = IntToEnglish.toEnglish(4606);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testThousands8() {
		String expected = "six thousand and ninety nine";
		String actual = IntToEnglish.toEnglish(6099);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testThousands9() {
		String expected = "nine thousand three hundred and seventy six";
		String actual = IntToEnglish.toEnglish(9376);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testTenThousands1() {
		String expected = "ten thousand";
		String actual = IntToEnglish.toEnglish(10000);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testTenThousands2() {
		String expected = "eleven thousand and four";
		String actual = IntToEnglish.toEnglish(11004);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testTenThousands3() {
		String expected = "fourteen thousand three hundred and fifty two";
		String actual = IntToEnglish.toEnglish(14352);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testTenThousands4() {
		String expected = "thirty thousand six hundred and eleven";
		String actual = IntToEnglish.toEnglish(30611);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testTenThousands5() {
		String expected = "sixty two thousand and forty five";
		String actual = IntToEnglish.toEnglish(62045);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testTenThousands6() {
		String expected = "seventy nine thousand seven hundred and sixty four";
		String actual = IntToEnglish.toEnglish(79764);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testTenThousands7() {
		String expected = "ninety six thousand one hundred and four";
		String actual = IntToEnglish.toEnglish(96104);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundredThousands1() {
		String expected = "one hundred thousand";
		String actual = IntToEnglish.toEnglish(100000);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundredThousands2() {
		String expected = "one hundred and eleven thousand and four";
		String actual = IntToEnglish.toEnglish(111004);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundredThousands3() {
		String expected = "two hundred and fourteen thousand three hundred and fifty two";
		String actual = IntToEnglish.toEnglish(214352);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundredThousands4() {
		String expected = "four hundred and thirty thousand six hundred and eleven";
		String actual = IntToEnglish.toEnglish(430611);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundredThousands5() {
		String expected = "five hundred and sixty two thousand and forty five";
		String actual = IntToEnglish.toEnglish(562045);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundredThousands6() {
		String expected = "six hundred and seventy nine thousand seven hundred and sixty four";
		String actual = IntToEnglish.toEnglish(679764);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testHundredThousands7() {
		String expected = "eight hundred and ninety six thousand one hundred and four";
		String actual = IntToEnglish.toEnglish(896104);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testMillion1() {
		String expected = "one million";
		String actual = IntToEnglish.toEnglish(1000000);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testMillion2() {
		String expected = "one million one hundred and eleven thousand and four";
		String actual = IntToEnglish.toEnglish(1111004);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testMillion3() {
		String expected = "two million two hundred and fourteen thousand three hundred and fifty two";
		String actual = IntToEnglish.toEnglish(2214352);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testMillion4() {
		String expected = "three million four hundred and thirty thousand six hundred and eleven";
		String actual = IntToEnglish.toEnglish(3430611);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testMillion5() {
		String expected = "four million five hundred and sixty two thousand and forty five";
		String actual = IntToEnglish.toEnglish(4562045);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testMillion6() {
		String expected = "five million six hundred and seventy nine thousand seven hundred and sixty four";
		String actual = IntToEnglish.toEnglish(5679764);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void testMillion7() {
		String expected = "nine million eight hundred and ninety six thousand one hundred and four";
		String actual = IntToEnglish.toEnglish(9896104);
		String errorMessage = "expected : " + expected + " : actual : " + actual;
		Assert.assertTrue(errorMessage, actual.contentEquals(expected));
	}
	
	@Test
	public void test() {
//		fail("Not yet implemented"); // TODO
	}

}
