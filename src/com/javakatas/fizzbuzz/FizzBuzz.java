package com.javakatas.fizzbuzz;

public class FizzBuzz {
	
	/**
	 * 
	 * Return Fizz for any number containing a 3 or divisible by 3.
	 * Return Buzz for any number containing a 5 or divisible by 5.
	 * Return FizzBuzz when both criteria are met.
	 * 
	 */
	protected String fizzer(Integer fizzable){
		String ret = "";
		if (fizzable % 3 == 0 || fizzable.toString().contains(Integer.toString(3))){
			ret += "Fizz";
		}
		if (fizzable % 5 == 0 || fizzable.toString().contains(Integer.toString(5))){
			ret += "Buzz";
		}
		return ret;
	}
}
