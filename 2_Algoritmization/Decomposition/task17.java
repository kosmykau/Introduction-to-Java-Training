package Decomposition;

import java.util.Scanner;

/*
 * 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
 *  Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */

public class task17 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Введите число >>");
		n = sc.nextInt();
		
        int count = countSubtract(n);
        System.out.println("Нужно произвести " + count + " вычитаний, чтобы получить нуль");
    }

    public static int sumDigits(int n){
        int sum = 0;
        while (n > 0){
            int digit = n % 10;
            n/=10;
            sum+=digit;
        }
        return sum;
    }

    public static int subtractSumOfDigits(int n){
        n-=sumDigits(n);
        return n;
    }

    public static int countSubtract(int n){
        int count = 0;
        while (n > 0){
           n = subtractSumOfDigits(n);
            count++;
        }
        return count;

	}

}
