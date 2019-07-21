package javaBootCampPractice;

public class PrimeOrNot {

	public static void main(String[] args) {
	// 2. write a Java program to find whether a number is prime or not

int num = 23;
 boolean flag = false;
 for(int i=2; i<=num/2; ++i) {
	   
         // condition for nonprime number
         if(num % i == 0)
         {
             flag = true;
             break;
         }
     }
     if (!flag)
         System.out.println(num + " is a prime number.");
    
  else
     System.out.println(num + " is not a prime number."); 
	}
	}

