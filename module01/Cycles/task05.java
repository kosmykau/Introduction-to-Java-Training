package com.epam.module01.cycles;
import java.util.Scanner;
//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:
public class task05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double e;
		System.out.println("Введите е: ");
		e = scan.nextDouble();
		
		double sum = 0;
		double an = 0;
		int n = 10;
		
		for (int i = 0; i <= n; i++) {
			an = 1/ Math.pow(2, i) + Math.pow(3, i);
			if (Math.abs(an) >= e) {
				sum += an;
			}
		}
		
		System.out.println("Сумма =" + sum);
	}

}
