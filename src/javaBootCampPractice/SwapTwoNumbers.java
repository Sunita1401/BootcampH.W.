package javaBootCampPractice;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int x,y;
		System.out.println("Enter two numbers for x and y");
		Scanner in= new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		
		x = x+y; //x= 7+8 =15
		y=x-y; // y=15-8=7
		x=x-y; // x=15-7=8
		
		System.out.println(x+"and"+y);
		

	}

}
