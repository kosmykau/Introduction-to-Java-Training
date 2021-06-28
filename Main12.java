package com.epam.module01.main;
//12.Вычислить расстояние между двумя точками с данными координатами 
//(х1,у1) и (х2,у2). 
import java.util.Scanner;
public class Main12 {
	
	public static void main(String[] args) {
		
		double s, a, b;
		
		double x1 = 2;
		double x2 = 4;
		double y1 = 1;
		double y2 = 5;
		
		a = x2 - x1;
		b = y2 - y1;
		
		s = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		System.out.println(s);
		
	}

}
