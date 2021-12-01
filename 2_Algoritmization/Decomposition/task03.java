package Decomposition;

import java.util.Scanner;

/*
 * 3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
 */

public class task03 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		double a;
				
		System.out.println("Введите сторону правильного шестиуголника >> ");
		a = sc.nextDouble();
		
		System.out.printf("Площадь правильного шестиугольника = %.1f ", hexagon(a));
		

	}
	
	public static double triangle(double a, double b, double c) {
		double s = (a + b + c) / 2;
		
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
	
	public static double hexagon(double a) {
		return 6 * triangle(a, a, a);
	}

}
