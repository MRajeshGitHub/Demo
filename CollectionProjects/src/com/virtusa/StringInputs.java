package com.virtusa;

import java.util.Scanner;

public class StringInputs {

	public static void main(String[] args) {
		// String Inputs from keyboard;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Yout name :");
		
		String name=sc.nextLine();
		String name1=sc.next(   );
		System.out.println("string values is"+name1);
		System.out.println("your name is :"+name);

		sc.close();
	}
	

}
