package com.blz.LeapYear;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Welcome to LeapYear Program!!");
		  int year;
		  
		System.out.println("Enter the Year:");
		Scanner scanner = new Scanner(System.in);
		year = scanner.nextInt();
		
		if(year % 100 == 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0)
		{
			System.out.println("It is a LeapYear");
		}
		
		else
		{
			System.out.println("It is not a LeapYear");
		}
		  
		
		
		

	}

}
