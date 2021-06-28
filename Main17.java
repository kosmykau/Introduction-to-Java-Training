package com.epam.module01.main;
//Даны 2 числа. Найти среднее арифметическое кубов этих чисел и среднее геометриеское модулей этих чисел.
public class Main17 {
	
	public static void main(String[] args) {
		
		double num1 = 5.5;
		double num2 = -3.2;
		
		double avgArithmetic = (Math.pow(num1, 3) + Math.pow(num2, 3)) / 2;
		double avgGeometric = Math.sqrt(Math.abs(num1) * Math.abs(num2));
		
		System.out.println("Среднее арифметическое кубов = " + avgArithmetic);
		System.out.println("Среднее геометричекое модулей = " + avgGeometric);
		
		
	}

}
