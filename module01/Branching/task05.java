package com.epam.module01.branching;
//5. Вычислить значение функции: F(x)={x^2 - 3x + 9,  если x <= 3;
//                                     1/(x^3 + 6),   если x > 3.}
public class task05 {

	public static void main(String[] args) {
		
		double fx = 0;
		double x = 2;
		
		if (x <= 3)
			fx = (Math.pow(x, 2) - (3 * x) + 9);
		
		else 
			fx = (1 / (Math.pow(x, 3) + 6));
	
		System.out.println("F(x) = " +fx);	
	
	}
}
