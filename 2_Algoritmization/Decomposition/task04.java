package Decomposition;

import java.util.Scanner;

/*
 * 4.На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими 
 *	 из пар точек самое большое расстояние. Указание. Координаты точек занести в массив. 
 */
public class task04 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите количество точек >>");
		int n = sc.nextInt();
		
		double[] x = new double[n];
		double[] y = new double[n];
		
		input(x, y);
		output(x, y);
		maxDistance(x, y);
		
	}
	
	public static void input(double[] a, double[] b) {
		for(int i = 0; i < a.length; i++) {
			a[i] = Math.random();
			b[i] = Math.random();
		}
	}
	
	public static void output(double[] a, double[] b) {
		for(int i = 0; i < a.length; i++) {
			System.out.printf("x = %d;  y = %f; ", i + 1, a[i],b[i]);
			System.out.println();
		}
	}
	
	public static void maxDistance(double[] a, double[] b) {
		double maxDist = 0;
		int c = 0;
		for(int i = 0; i < a.length - 1; i++) {
			double d = Math.sqrt(Math.pow(a[i + 1] - a[i], 2) + Math.pow(b[i + 1] - b[i], 2));
			if(maxDist < d) {
				maxDist = d;
				c = i;
			}
		}
		System.out.println();
		System.out.printf("Максимальное расстояние между %d и %d точками ", c + 1, c + 2);
	}

}
