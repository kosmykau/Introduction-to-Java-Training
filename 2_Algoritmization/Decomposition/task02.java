package Decomposition;

import java.util.Scanner;

/*
 * 2.Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

public class task02 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d;
		
		System.out.println("Введите первое натуральное число >> ");
		a = sc.nextInt();
		
		System.out.println("Введите второе натуральное число >> ");
		b = sc.nextInt();
		
		System.out.println("Введите третье натуральное число >> ");
		c = sc.nextInt();
		
		System.out.println("Введите четвертое натуральное число >> ");
		d = sc.nextInt();
		
		System.out.println("Наибольший общий делитель: " + gcdf(a, b, c, d));

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
	
	public static int gcdf(int a, int b, int c, int d) {
		return gcd(gcd(a ,b), gcd(c, d));
	}

}
