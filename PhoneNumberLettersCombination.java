package medium;

//    Phone Number Letter combinations :
//Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
//
//		A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
//
//			Example 1:
//			Input: digits = "23"
//			Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

//			Example 2:
//			Input: digits = ""
//			Output: []

//			Example 3:
//			Input: digits = "2"
//			Output: ["a","b","c"]

public class PhoneNumberLettersCombination {
	
	public static String[] findCombinations(String digits) {
//		if the empty digits return empty string
		if(digits.length() == 0) {
			return new String[0];
		}
		
//		Assign letters to numbers 
		String num2 = "abc";
		String num3 = "def";
		String num4 = "ghi";
		String num5 = "jkl";
		String num6 = "mno";
		String num7 = "pgrs";
		String num8 = "tuv";
		String num9 = "wxyz";
		
//		Find user input digits, divide and assign them to new string variables
		String firstDigit="", secondDigit="";
		
//		Assign first digit values for first digit
		if(digits.charAt(0)== '2') firstDigit=num2;
		else if(digits.charAt(0)== '3') firstDigit=num3;
		else if(digits.charAt(0)== '4') firstDigit=num4;
		else if(digits.charAt(0)== '5') firstDigit=num5;
		else if(digits.charAt(0)== '6') firstDigit=num6;
		else if(digits.charAt(0)== '7') firstDigit=num7;
		else if(digits.charAt(0)== '8') firstDigit=num8;
		else if(digits.charAt(0)== '9') firstDigit=num9;
		
//		if user input is 1 digit
		if(digits.length()==1) {
			String[] firstDigitOutput = new String[firstDigit.length()];
			for(int i=0; i<firstDigit.length(); i++) {
				firstDigitOutput[i] = "" + firstDigit.charAt(i);
			}
			return firstDigitOutput;
		}
		
//		if user in put is 2 digits
		if(digits.length()>1) {
			if(digits.charAt(1)== '2') secondDigit=num2;
			else if(digits.charAt(1)== '3') secondDigit=num3;
			else if(digits.charAt(1)== '4') secondDigit=num4;
			else if(digits.charAt(1)== '5') secondDigit=num5;
			else if(digits.charAt(1)== '6') secondDigit=num6;
			else if(digits.charAt(1)== '7') secondDigit=num7;
			else if(digits.charAt(1)== '8') secondDigit=num8;
			else if(digits.charAt(1)== '9') secondDigit=num9;
		}
		
//		Calculate total length of the combinations 
		int totalLength = firstDigit.length() * secondDigit.length();
		String[] twoDigitOutput = new String[totalLength];
		
//		Generate combinations
		int index = 0; // for maintaining index of twoDigitOutput[3*3]
		for(int i=0; i<firstDigit.length(); i++) { 
			for(int j=0; j<secondDigit.length(); j++) {
				twoDigitOutput[index++] = "" + firstDigit.charAt(i)+secondDigit.charAt(j);
			}
		}
		return twoDigitOutput;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "23";
		String[] output = findCombinations(input);
		
		for(int i=0; i<output.length; i++) {
			System.out.print("["+output[i]+"]");
		}
	}

}
