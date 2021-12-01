package Decomposition;

import java.util.Scanner;

/*
 * 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

public class task11 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Нужно ввести два числа разной длинны : ");
		System.out.println("Введите первое число >>");
		int a = sc.nextInt();
		System.out.println("Введите второе число >>");
		int b = sc.nextInt();
		
		isLonger(a, b);
	}
	
	public static int numOfDigits(int num) {
		int count = 1;
		
		while(num >= 10) {
			num /= 10;
			count++;
		}
		return count;
	}
	
	public static void isLonger(int a, int b) {
		int countA = numOfDigits(a);
		int countB = numOfDigits(b);
		
		if(countA > countB) {
			System.out.println("В первом числе цифр больше.");
		} else if(countA == countB) {
			System.out.println("В двух числах одинаковое количество цифр.");
		} else {
			System.out.println("Во втором числе цифр больше.");
		}
		return;
	}

}
