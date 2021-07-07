package com.epam.module01.cycles;
//2. Вычислить значения функции на отрезке [а,b] c шагом h: y={x,x>2
//                                                             -x,x<=2
public class task02 {

	public static void main(String[] args) {
		
		int a = - 5;
		int b = 5;
		int h = 2;
		int y;
		
		for (int i = a; i <= b; i += h) {
			if (i >2) {
				y = i;
			} else {
				y = i * (-1);
			}
			System.out.println("y = " + y + " при х = " + i);	
		}
	}

}
