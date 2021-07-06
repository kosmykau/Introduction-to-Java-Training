package com.epam.module01.branching;
//3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
public class task03 {

	public static void main(String[] args) {
		
		double x1 = 2;
		double x2 = 3;
		double y1 = 4;
		double y2 = 5;
		double x3 = 6;
		double y3 = 7;
		
		if ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0) {
			System.out.println("Точки A, B, C расположены на одной прямой");
		} else {
			System.out.println("Точки A, B, C не расположены на одной прямой");
		}
			
	}

}
