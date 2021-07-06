package com.epam.module01.main;
//Дано действительное число R вида nnn.ddd (3 цифровых разряда в дробной и целой
// частях). Поменять местами дробную и целую части и вывести полученное значение числа.
public class task04 {
	
	public static void main(String[] args) {
		
		double a = 555.666;
		
		int b = (int) a;
		int c = (int) ((a - b) * 1000);

		double res = c + b * 0.001;
		
		System.out.println("Исходное число " + a + "\nПолученное число " + res);
				
	}

}
