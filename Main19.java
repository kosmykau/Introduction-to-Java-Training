package com.epam.module01.main;
//Дана сторона равностороннего треугольника. Найти площадь этого треугольника,
//его высоту, радиусы вписанной и описанной окружностей.
public class Main19 {
	
	public static void main(String[] args) {
		
		double a = 5;
		double s = (Math.pow(a, 2) * Math.sqrt(3)) / 4;
		double h = (a * Math.sqrt(3)) / 2;
		double rIn = (a * Math.sqrt(3)) / 6;
		double rOut = (a * Math.sqrt(3)) / 3;
		
		System.out.println("Площадь треугольника = " + s);
        System.out.println("Высота = " + h);
        System.out.println("Радиус вписанной окружности = " + rIn);
        System.out.println("Радиус описанной окружности = " + rOut);
	}

}
