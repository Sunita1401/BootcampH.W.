package javaBootCampPractice;

public class FibonacciSeries {

	public static void main(String[] args) {

		 int maxNumber = 10; 
		 int previousNumber = 0;
		 int nextNumber = 1;
		 
	        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
 
	        for (int i = 0; i <= maxNumber; ++i)
	        {
	            System.out.print(previousNumber+" ");
	            /* On each iteration, we are assigning second number
	             * to the first number and assigning the sum of last two
	             * numbers to the second number
	             */
 
	      
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }
 
	}

	}


