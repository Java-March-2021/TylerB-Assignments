package com.codingdojo.calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator testOne = new Calculator(10.5, 5.2, "-");
		
		testOne.performOperation();
		System.out.println(testOne.getResults());
	}
}
