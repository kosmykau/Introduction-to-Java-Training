package com.epam.module01.main;
//5. Составить алгоритм нахождения среднего арифметического двух чисел.
import java.util.Scanner;
public class Main5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Введите первое число");
		
		a = scan.nextDouble();
			System.out.println("Первое число - " + a);
			
			System.out.println("Введите второе число");
		
		
		b = scan.nextDouble();
		
			System.out.println("Введите Второе число - " + b);
		
			System.out.println("Среднее арифметическое - " + (a + b) / 2);

			
		
		
		
		
//		
//		double a, b, c;
//		
//		a = 3;
//		b = 8;
//		
//		c = (a + b) / 2;
//		
//		System.out.print("Среднее арифметическое  " + a +" и " + b +" - " + c);
		
		
	}
}
