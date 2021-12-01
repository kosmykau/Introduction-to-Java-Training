package Decomposition;

import java.util.Scanner;

/*
 * 1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел:
 НОК(А,B) = А * B / НОД(А,B)
 */

public class task01 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Введите первое натуральное число >> ");
		a = sc.nextInt();
		
		System.out.println("Введите второе натуральное число >> ");
		b = sc.nextInt();
		
		System.out.println("Наибольший общий делитель: " + gcd(a, b));
		System.out.println("Наименьшее общее кратное: " + lcm(a, b));

	}
	
	public static int gcd(int a, int b) {
		int res;
		while (b != 0) {
			res = b;
			b = a % b;
			a = res;
		}
		return a;
	}
	
	public static int lcm(int a, int b) {
		return Math.abs(a * b) / gcd(a, b);
	}

}
