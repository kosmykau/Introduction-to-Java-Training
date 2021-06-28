package com.epam.module01.main;
//Вычислить значение выражения по формуле (все переменные принимают действительные
//значения): (a/c)*(b/d) - ((ab-c)/(cd))

public class Main9 {
	
	public static void main(String[] args) {
		
//		double a;
//		double b;
//		double c;
//		double d;
//		double z;
//		double x;
//		double y;
//		double w;
//		double t;
//		double q;
//		double g;
//		
//		
//	   a = 2.2;
//	   b = 5.1;
//	   c = 3.7;
//	   d = 7.6;
//	   
//	   x = a / c;
//	   y = b / d;
//	   w = x * y;
//	   t = (a * b) - c;
//	   q = c * d;
//	   g = t / q;
//	   
//	   z = w - g;
	   
	   double z;
	   double a = 2.2;
	   double b = 5.1;
	   double c = 3.7;
	   double d = 7.6;
	   
	   z = (a/c)*(b/d) - (((a * b)-c)/(c * d));
	   
	   	System.out.print(z);
	   
	   
	   
			   
	}

}
