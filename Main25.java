package com.epam.module01.main;
//Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами
//a, b и с (предполагается, что а≠0 и что дискриминант уравнения неотрицателен.
public class Main25 {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = 4;
		double c = -6;
		
		double d = Math.pow(b, 2) - 4 * a * c;
		double x1 = (- b + Math.sqrt(d)) / (2 * a);
		double x2 = (- b - Math.sqrt(d)) / (2 * a);
		
		System.out.println(a + "x2 + " + b + " x + " + c + " = 0");
		System.out.println("x1 = " + x1 + ", x2 + " + x2);
	}

}
