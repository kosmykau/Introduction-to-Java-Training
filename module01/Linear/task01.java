package com.epam.module01.main;
//1.Найдите значение функции:z=((a–3)*b/2)+c.
public class Main4 {
	
	public static void main(String[] agrs) {
		
		double a;
		double b;
		double c;
		double z;
		double temp;
		
		a = 5;
		b = 2;
		c = 1;

		temp = a - 3;
		temp = temp * b;
		temp = temp / 2;
		
		z = temp + c;
		
		 System.out.print("z = " + z);
		
		}		
}		
