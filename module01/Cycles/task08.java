package com.epam.module01.cycles;
import java.util.Scanner;
//8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
public class task08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a, b;
		
		System.out.print("Введите число а: ");
		a = scan.nextInt();
		System.out.print("Введите число b: ");
		b = scan.nextInt();
		
		while (a > 0) {
			int c = a % 10;
			a /= 10;
			int d = b;
			while (d > 0) {
				if ((d % 10) == c) {
					System.out.print(c + " ");
					break;
				}
				d /= 10;
			}
		}
		

	}

}
