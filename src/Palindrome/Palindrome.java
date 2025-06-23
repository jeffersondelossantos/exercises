package Palindrome;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
		System.out.println("is %s a palindrome: %s".formatted(5, isPalindrome(5)));
		System.out.println("is %s a palindrome: %s".formatted(121, isPalindrome(121)));
	}

    public static boolean isPalindrome(int num) {
		int newNum;
		int numberToTest = num;
		List<Integer> digits = new ArrayList<>();

//		while (numberToTest != 0) {
//			int x = num % 10;
//		}
		// while (numberToTest != 0) {
		// 	int digit = numberToTest % 10;

		// 	digits.add(digit);
		// 	numberToTest = numberToTest / 10;
		// }

		for (int i = 1; numberToTest != 0; i++) {
			int digit = num % 10;
			digits.add(digit);
			// newNum = (i * 10) ;
			num = num / 10;
		}

		// while (i <= 0) {

		// }

		return true;
    }
}
