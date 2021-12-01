package Decomposition;

import java.util.Scanner;

/*
 * 14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу.
 *  Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
 */

public class task14 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int k;
		
		System.out.println("Введите число К >>");
		k = sc.nextInt();
		
		System.out.println("Числа Армстронга от 1 до " + k +":");
	
        for (int i = 1; i < k ; i ++){
            if (isArmstrongNumber(i))
                System.out.print(i + " ");
        }
    }

    public static int amountOfNumbers(int a){
        int count = 0;
        
        while (a > 0){
            a = a / 10;
            count++;
        }
        return count;
    }

    public static boolean isArmstrongNumber(int n ){
        int a = 0;
        int sum = 0;
        int temp=n;
        int count = amountOfNumbers(n);
        int prime = 1;
        
        while( n > 0){
            a = n % 10;
            n = n / 10;
            for (int j = 0; j < count; j ++){
                prime*=a;
            }
            sum += prime;
            prime = 1;
        }
        if(temp == sum){
            return true;
        }
        else return false;
    }
		}
	


