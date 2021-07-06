package com.epam.module01.main;
//2. Вычислить значение выражения по формуле (все переменные принимают
//действительные значения): 𝑏+√𝑏2 +4𝑎𝑐−𝑎3𝑐+𝑏−2
public class task02 {
	
	public static void main (String[] args) {
		
		double b;
		double a;
		double c;
		double temp;
		
		b = 2;
		a = 4;
		c = 10;
		
		temp = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c);
		temp =  temp / (2 * a);
		temp = temp - (Math.pow(a, 3) * c);
		temp = temp + Math.pow(b, -2);		
		
		System.out.print(temp);			
	}

}
