package Decomposition;

import java.util.Scanner;

/*
 * 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
 */

public class task09 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		double x;
		double y;
		double z;
		double t;
		
		System.out.println("Введите длинну x >>");
		x = sc.nextDouble();
		System.out.println("Введите длинну y >>");
		y = sc.nextDouble();
		System.out.println("Введите длинну z >>");
		z = sc.nextDouble();
		System.out.println("Введите длинну t >>");
		t = sc.nextDouble();
		
		System.out.println("Площадь четырехугольника = " + AreaOfTheQuadrangle(x, y, z, t));

	}
	
	public static double PythagoreanTheorem(double a, double b) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}
	
	public static double AreaOfTheFirstTriangle(double a, double b) {
		return (a * b) / 2;
	}
	
	public static double AreaOfTheSecondTriangle(double a, double b, double c) {
		double p = (a + b + c) / 2;
		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return s;
	}
	public static double AreaOfTheQuadrangle(double x, double y, double z, double t) {
		double d = PythagoreanTheorem(x, y);
		double sumOfAreasOfTreangles = AreaOfTheFirstTriangle(x, y) + AreaOfTheSecondTriangle(t, z, d);
		return Math.round(sumOfAreasOfTreangles * 100) / 100;
	}

}
