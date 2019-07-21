package javaBootCampPractice;

import java.util.Scanner;

public class Palindrome {
// Write a java program to find the whether a string or number is palindrome or not
	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner userinput = new Scanner(System.in);
		String userdata = userinput.nextLine();
		userdata = userdata.toLowerCase();
		int userdataLen = userdata.length();
		String reverse = "";
		for (int i = userdataLen - 1; i >= 0; i--)

			reverse = reverse + userdata.charAt(i);

		System.out.println(reverse);
		if (reverse.equals(userdata)) {

			System.out.println("the String is palindrome");
		}

		else {

			System.out.println("The string is not palindrome");
		}

	}

}
