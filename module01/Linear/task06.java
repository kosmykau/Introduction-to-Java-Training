package com.epam.module01.main;
//Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае
public class task06 {
	
	public static void main(String[] args) {
	   int x = 1;
           int y = -1;

	   if ((x < 4) && (x > -4)) {
           	if ((y < 4) && (y > -3)) {
              	     if ((y > 0) && ((x < 4) && (x > -4)))
                    System.out.println("false");
                else
                    System.out.println("true");
            } else
                System.out.println("false");
        } else
            System.out.println("false");
	}
	

}	
		
	

