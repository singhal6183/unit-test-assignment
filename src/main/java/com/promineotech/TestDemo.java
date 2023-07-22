package com.promineotech;

public class TestDemo {
	
	
	/*
	 * Create a method (not static) named addPositive. It should take two
	 * integer parameters and return an integer.
	 
	 
	 * If both parameters are positive (greater than zero) return the sum of the
	 * parameters. If either parameter is zero or negative, throw an
	 * IllegalArgumentException with the message
	 * "Both parameters must be positive!".
	 */
	public int addPositive(int a, int b) {
		   if (a > 0 && b > 0) { 
			   return a + b;
		   } else {  
			   throw new IllegalArgumentException("Both parameters must be positive!");
	        }

}

	/*
	 * Create a method (not static) named multiplyPositive. It should take two
	 * integer parameters and return an integer.
	 
	 * If both parameters are positive (greater than zero) return the multipication of the
	 * parameters. If either parameter is zero or negative, throw an
	 * IllegalArgumentException with the message
	 * "Both parameters must be positive!".
	 */
	public int multiplyPositive(int a, int b) {
		   if (a > 0 && b > 0) { 
			   return a * b;
		   } else {  
			   throw new IllegalArgumentException("Both parameters must be positive!");
	        }

}
	
}
