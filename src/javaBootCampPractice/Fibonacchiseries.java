package javaBootCampPractice;

import java.util.Scanner;

public class Fibonacchiseries {

	public static void main(String[] args) {
		// Fibonachhi number=0,1,1,2,3,5,8,13
		int num, a =0, b=0, c=1;
		System.out.println("Enter numbers");
		Scanner in = new Scanner(System.in);
		num=in.nextInt();
		
		for(int i=0; i<num; i++) {
			
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+"  "+b+"  "+c);
		} 
	
	}

}
