package com.jonline.module01.main;
//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//((𝑏+√𝑏2 +4𝑎𝑐) / 2a) −𝑎3𝑐+𝑏−2

public class Second {
	public static void main (String[] args) {
		
		double b;
		double a;
		double c;
		double temp;
//		double x;
		
		
		b = 2;
		a = 4;
		c = 10;
		
		temp = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c);
		temp =  temp / (2 * a);
		temp = temp - (Math.pow(a, 3) * c);
		temp = temp + Math.pow(b, -2);
		
		
		
//		x = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c) / 2 * b - Math.pow(a, 3) * c + Math.pow(b, -2);
		
		System.out.print(temp);
		
		
	}

}
