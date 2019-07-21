package javaBootCampPractice;

import java.util.Scanner;

public class PrimeNumberAnotherMethod {

	public static void main(String[] args) {
		// prime number are greater then 1 and divided by one
		// 2,3,5,7
		// use scanner for user input
		// divide number by 2, if remaining it could divide by 3 or 5 or 7
		// if its not divided by any of these numbers then its a prime number

		System.out.println("provide the Number");

		int x, num;
		boolean isprime = true;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		in.close();
		for (int i = 2; i < num / 2; i++) {
			x = num % i;
			if (x == 0) {
				isprime = false;
				break;
			}
		}
		if (isprime)
			System.out.println("number is prime");
		else {
			System.out.println("number is not prime");
		}
	}

}
