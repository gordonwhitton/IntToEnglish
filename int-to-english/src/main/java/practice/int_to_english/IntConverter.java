package practice.int_to_english;

import java.security.InvalidParameterException;

public class IntConverter {

	private static final int MAX_VALUE = Integer.MAX_VALUE;
	private static final int MIN_VALUE = 0;

	public static int[] split(int value) {
		
		if(value < MIN_VALUE){
			throw new InvalidParameterException("value must be greater than or equal to zero");
		}
		
		if(value > MAX_VALUE){
			throw new InvalidParameterException(String.format("value %s exceeds limit", MIN_VALUE));
		}
		
		String valueString = String.valueOf(value);
		char[] charArray = valueString.toCharArray();
		
		//convert the values to int and reverse (makes the value more readable by the consumer)
		
		int[] intArray = new int[charArray.length];
		
		for(int i = 0, j = charArray.length - 1; i < charArray.length; i++, j--){
			intArray[j] = charArray[i] - '0'; //converts ASCII char to integer
		}
		
		return intArray;
	}
}
