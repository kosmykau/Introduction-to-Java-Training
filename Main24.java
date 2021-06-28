package com.epam.module01.main;
//Найти площадь равноедренной трапеции с основаниями a и b и углом α(альфа)	при большем основании а.
public class Main24 {
	
	public static void main(String[] args) {
		
		double a = 5.0;
		double b = 3.2;
		double corner = 45;
		
		double cornerRad = (corner * Math.PI) / 180.0;
		
		double S = (Math.pow(a, 2) - Math.pow(b, 2) / 4) * Math.tan(cornerRad);
		
		System.out.println("Площадь трапеции с а = " + a + ", b = " + b + " и α = " + corner + " равна " + S);
		
	}

}
