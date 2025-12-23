package com.tnsif.exceptionhandling;

public class TryCatchExample {
	static int performDivision(int x, int y) {
		System.out.println("I am in "
				+ "performDivision method");
		int z = 0;
		z = x / y;
		return z;
	}

	static float performDivision(float a, float b) {
		return a / b;
	}


public static void main(String[]args) {
	try {
		int result = performDivision (10,0);
		System.out.println("Result = "+result);
	}
	catch(ArithmeticException e) {
		System.out.println("cannnot divided by zero");
	}
	float f = performDivision(10.5f,2.5f);
	System.out.println("Float Result = "+f);
}
}
