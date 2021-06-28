package com.epam.module01.main;
//Найти (в радианах в градумах) все углы треугольника со сторонами a, b, c.
public class Main29 {

	public static void main(String[] args) {
		
		double a = -1.0;
		double b = -0.5;
		double c = 0.7;
		
		double cornerARad = Math.acos((b * b + c * c - a * a) / (2 * b * c));
		double cornerADegr = cornerARad * 180 / Math.PI;
		
		double cornerBRad = Math.acos((a * a - c * c - b * b) / (2 * a * c));
		double cornerBDegr = cornerBRad * 180 / Math.PI;
		
		double cornerCRad = Math.acos((a * a - b * b - c * c) / (2 * a * b));
		double cornerCDegr = cornerCRad * 180 / Math.PI;
		
		System.out.println("Треугольник со сторонами " + a + " " + b + " " + c);
		System.out.println("Угол 1 = " +cornerARad + " рад " + cornerADegr + " гр");
		System.out.println("Угол 2 = " +cornerBRad + " рад " + cornerBDegr + " гр");
		System.out.println("Угол 3 = " +cornerCRad + " рад " + cornerCDegr + " гр");
		
		
	}
}
