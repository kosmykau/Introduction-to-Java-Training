package com.epam.module01.main;
//Дана длина куба. Найти площадь грани, площадь полной поверхности и объем этого куба.
public class Main18 {
	
	public static void main(String[] args) {
		
		double a = 5;
		
		double s = a * 2;
		double sAll = s * 6;
		double v = Math.pow(a, 3);
		
		System.out.println("Площадь грани = " + s);
		System.out.println("Площадь полной поверхности = " + sAll);
		System.out.println("Объем куба = " +v);
		
	}

}
