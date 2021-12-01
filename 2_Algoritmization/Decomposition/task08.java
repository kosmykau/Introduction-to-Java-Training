package Decomposition;

import java.util.Random;
import java.util.Scanner;

/*
 * 8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. 
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
 */

public class task08 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Задайте размер массива >> ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Дан массив: ");
        input(arr);
        output(arr);
        
        System.out.println("\nВведи порядковый номер элемента массива k >>");
        int k = sc.nextInt();
        System.out.println("\nВведи порядковы номер элемента массива m >>");
        int m = sc.nextInt();
        if (m-k != 3){
            System.out.println("Неверный ввод! \nНужно вычислить три последовательно расположенных элементa.\nПробуй заново!");
            System.exit(0);
        }

        System.out.println("Сумма трех последовательно расположенных элементов массива = "+Sum(arr,k,m));
    }

    public static void input(int[] arr) {
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
    }
    public static void output(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int Sum(int[] arr,int k, int m){
        int sum = 0;
        for (int i = k; i < m; i++){
            sum+=arr[i];
        }
        return sum;
    }
}

