package assignment2;

import java.util.Scanner;

public class SquareofNumber {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number, square;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();		
		
		square = number * number;
		
		System.out.println("\n The Square of a Given Number  " + number + "  =  " + square);
	}
}


