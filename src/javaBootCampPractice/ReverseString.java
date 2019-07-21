package javaBootCampPractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// Write a java program to reverse a string using string inbuilt function
	// Planning 
		//it should reverse a string
		//whatever you typed should be reversed
		// saying to give your input
		System.out.println("Enter a string to reverse");
		// reading your input
		Scanner input = new Scanner (System.in);
		String original = input.nextLine();
		
		char[]charData = original.toCharArray();
		int length = original.length();
		
		String reverse ="";
		
		for(int i = length-1; i>=0; i--) {
			
			reverse = reverse + charData[i];
				
		}
		System.out.print(reverse);

	}

}
