package com.epam.module01.main;
//Найти площадь треугольника, две стороны которого равны a и b, a угол между этими
// сторонами у.
public class Main26 {

	public static void main(String[] args) {
		
		double a = 4;
		double b = 6;
		double corner = 30;
		
		double cornerRad = (corner * Math.PI) * 180.0;
		
		double S = 0.5 * a * b * Math.sin(cornerRad);
		
		System.out.println("Площадь треугольника с a = " + a + ", b = " + b + " и α = " + corner + " равна " + S);
	}
}
