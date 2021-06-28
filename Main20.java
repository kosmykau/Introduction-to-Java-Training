package com.epam.module01.main;
//Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
public class Main20 {
	
	public static void main(String[] args) {
		
		
		double l = 10;
		
		double r = l / (2 * Math.PI);
		double s = Math.PI * Math.pow(r, 2);
		
		System.out.println("Для круга с R = " + r + " длина окружности = " + l + ", площадь круга = " + s);
		
	}

}
