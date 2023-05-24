package com.virtusa;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Scanner test using string Data....
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Name:  ");
		
		String name=sc.nextLine();
		
		System.out.println("Length of the Name is  :"+name.length());
		System.out.println("First Charactre of the Name:"+name.charAt(0));
		System.out.println("Last Character of the Name :"+name.charAt(name.length()-1));
		
		

	}

}
