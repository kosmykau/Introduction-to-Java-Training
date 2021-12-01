package Decomposition;

import java.util.Scanner;

/*
 * 13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. 
 * Для решения задачи использовать декомпозицию.
 */

public class task13 {

	public static void main(String[] args) {
		int n;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите простое число больше 2 >> ");
		n = sc.nextInt();
		if (n < 2) {
			System.out.println("Неверно! Попробуй еще раз");
		}
		
		int n2 = 2 * n;	
		
		System.out.println("Числа-близнецы: ");
		
		for (int i = n; i + 2 < n2; i++) {
			if (primeNumber(i) && primeNumber(i + 2)) {				
				System.out.print(i + ", " + (i+2) + " \r");
			}			
		}
		System.out.println();
	}
	
	public static boolean primeNumber(int n) {
		if (n <= 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
		    if (n % i == 0) {
			return false;
		    }
		}
        	return true;
    }	

}
