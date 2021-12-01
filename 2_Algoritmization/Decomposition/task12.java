package Decomposition;

import java.util.Scanner;

/*
 * 12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа, сумма цифр которых равна К и которые не большее N.

 */

public class task12 {

	public static void main(String[] args) {
		int k;
		int n;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число К >>");
		k = sc.nextInt();
		System.out.println("Введите число N >>");
		n = sc.nextInt();
        System.out.printf("K=%d N=%d",k,n);
        System.out.println();
        Array(k,n);
    }
    public static void Array(int k, int n){
    	int a;
    	int b;
    	int sum;
    	
        for (int i = 0; i < n; i++){
            	a = i % 10;
            	b = (i / 10) % 10;
            	sum = a + b;
            if ((sum == k) && (sum < n)){
                System.out.println(i)   ;
            }
        }
    }
	}

