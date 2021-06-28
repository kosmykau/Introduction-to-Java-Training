package com.epam.module01.main;
//Заданы координаты 3 вершин треугольника (x1,y1),(x2,y2),(x3,y3).Найти его
//периметр и площадь
public class Main13 {

	public static void main(String[] args) {
		
		double p2, P, S, a, b, c;
		
		double x1 = 2;
		double x2 = 6;
		double x3 = 8;
		double y1 = 1;
		double y2 = 5;
		double y3 = 7;
		
		a = Math.sqrt(Math.sqrt(x2 - x1) + Math.sqrt(y2 - y1));
		b = Math.sqrt(Math.sqrt(x3 - x2) + Math.sqrt(y3 - y2));
		c = Math.sqrt(Math.sqrt(x3 - x1) + Math.sqrt(y3 - y1));
		
		P = a + b + c;
		p2 = P / 2;
		S = Math.sqrt(p2 * (p2 - a) * (p2 - b) * (p2 - c));
		
		System.out.println("Периметр = " + P + "\nПлощадь - " + S);
	}
}
