package com.epam.module01.cycles;
import java.util.Scanner;
//7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
public class task07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int m, n;
		System.out.println("Задайте промежуток от m до n: ");
		
		do {
			System.out.print("Введите m: ");
			m = scan.nextInt();
		} while (Integer.signum(m) != 1);
		
		do {
			System.out.print("Введите n: ");
			n = scan.nextInt();
		} while (n<= m);
		
		System.out.println("m = " + m + ", n = " + n);
		
		for (int i = m; i<= n; i++) {
			System.out.print("Число: " + i + ", делители: ");
			for (int x = 2; x < i; x++) {
				if (i % x == 0) {
					System.out.print(x + " ");
				}
			}
			System.out.println();
		}

	}

}
