package com.epam.module01.main;
//Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае
import java.util.Scanner;
public class Main38 {
	
	public static void main(String[] args) {
		
		int x = scannerInt();
        int y = scannerInt();

        // task a
        if (y + Math.abs(x) <= 4 && y >= 0){
            System.out.print("True: ");
        }
        else{
            System.out.print("False: ");
        }
        System.out.println("Точка с координатами (" + x + ", " + y + ") принадлежит закрашенной области");

        // task b
        if ((y >= 0 && y <= 4 && x >= -2 && x <= 2) || (y >= -3 && y <= 0 && x >= -4 && x <= 4)){
            System.out.print("True: ");
        }
        else{
            System.out.print("False: ");
        }
        System.out.println("Точка с координатами (" + x + ", " + y + ") принадлежит закрашенной области");

        // task c
        if (((x * x + y * y <= 16) && y >= 0 && x >= 0) || ((x * x + y * y <= 25) && y <= 0 && x >= 0)){
            System.out.print("True: ");
        }
        else{
            System.out.print("False: ");
        }
        System.out.println("Точка с координатами (" + x + ", " + y + ") принадлежит закрашенной области");
	}

	private static int scannerInt() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	}

