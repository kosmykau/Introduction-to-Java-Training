package com.epam.module01.main;
//4.Найдите значение функции:z=((a–3)*b/2)+c.
public class Main4 {
	
	public static void main(String[] agrs) {
		
		double a;
		double b;
		double c;
		double z;
		
		a = 5;
		b = 2;
		c = 1;
//		
//		z = ( (a - 3) * b / 2) + c;
//		
//		System.out.println("z = " + z);
		
		double temp;
		
		temp = a - 3;
		temp = temp * b;
		temp = temp / 2;
		
		z = temp + c;
		
		 System.out.print("z = " + z);
		
		}		
}		
