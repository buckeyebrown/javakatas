package com.javakatas.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest extends FizzBuzz {

	FizzBuzz fizzVar = new FizzBuzz();
	
	@Test
	public void returnFizzForNumberDivByThree(){
		assertEquals("Fizz", fizzVar.fizzer(3));
		assertEquals("Fizz", fizzVar.fizzer(9));
	}
	
	@Test
	public void returnFizzForNumberContainingThree(){
		assertEquals("Fizz", fizzVar.fizzer(13));
		assertEquals("Fizz", fizzVar.fizzer(83));
	}
	
	@Test
	public void returnBuzzForNumberDivByFive(){
		assertEquals("Buzz", fizzVar.fizzer(5));
		assertEquals("Buzz", fizzVar.fizzer(100));
	}
	
	@Test
	public void returnBuzzForNumberContainingFive(){
		assertEquals("Buzz", fizzVar.fizzer(52));
		assertEquals("Buzz", fizzVar.fizzer(56));
	}
	
	@Test
	public void returnFizzBuzzForNumberDivByThreeAndFive(){
		assertEquals("FizzBuzz", fizzVar.fizzer(15));
		assertEquals("FizzBuzz", fizzVar.fizzer(30));
	}

	@Test
	public void returnFizzBuzzForNumberContainingFiveAndThree(){
		assertEquals("FizzBuzz", fizzVar.fizzer(53));
	}
}
