package Nivi;
import java.math.*;
import java.util.*;

class CheckSumIsPalindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number: ");
		BigInteger bi = input.nextBigInteger();
		int num = 0;
		String strSum = bi.toString();
		for (int i = 0; i < strSum.length(); i += 2) {
			char ch = strSum.charAt(i);
			int n = Integer.parseInt(Character.toString(ch));
			num += n;
		}
		System.out.println("Sum of Alternate digits is: " + num);
		int n = num;
		int reversedNumber = 0;
		for (int i = 0; i <= num; i++) {
			int r = num % 10;
			num = num / 10;
			reversedNumber = reversedNumber * 10 + r;
			i = 0;
		}
		if (n == reversedNumber) {
			System.out.print("Number is palindrome!");
		} else {
			System.out.println("Number is not palindrome!");
		}
	}
}

