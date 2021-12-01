package Decomposition;

import java.util.Scanner;

/*
 * 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

public class task06 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("Введите первое число >> ");
		a = sc.nextInt();
		System.out.println("Введите второе число >> ");
		b = sc.nextInt();
		System.out.println("Введите третье число >> ");
		c = sc.nextInt();
		
		System.out.println(comprimeNums(a, b, c));

	}
	
	public static boolean comprimeNums(int a, int b, int c) {
		return gcd(gcd(a, b), c) == 1;
	}
	
	public static int gcd(int a, int b) {
		int res;
		
		while(b != 0) {
			res = b;
			b = a % b;
			a = res;
		}
		return a;
		
	}

}
