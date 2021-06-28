package com.epam.module01.main;
//Найти плозадь кольца, внутренний радиус которого равен r, а внешний - R(R>r).
public class Main23 {

	public static void main(String[] args) {
		
		double r = 2.5;
		double R = 3.1;
		
		double S = Math.PI * (Math.pow(R, 2) - Math.pow(r, 2));
		
		System.out.println("Площадь кольца с r = " + r + " и R = " + R + " равна " + S);
		
		
	}
}
