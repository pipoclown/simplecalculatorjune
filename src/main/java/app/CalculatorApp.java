package app;

import calci.Calculator;

public class CalculatorApp {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		int a = 10;
		int b = 5;

		System.out.println("add(" + a + ", " + b + ") = " + calculator.add(a, b));
    	System.out.println("subtract(" + a + ", " + b + ") = " + calculator.subtract(a, b));
		System.out.println("divide(" + a + ", " + b + ") = " + calculator.divide(a, b));
		System.out.println("multiply(" + a + ", " + b + ") = " + calculator.multiply(a, b));
//		System.out.println("max(" + a + ", " + b + ") = " + calculator.max(a, b));
//		System.out.println("min(" + a + ", " + b + ") = " + calculator.min(a, b));
	}
}