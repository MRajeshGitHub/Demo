package com.virtusa;

import java.util.Scanner;

import java.util.Scanner;

public class ConversionUpperToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Upper to Lower conversion...lower to Upper conversion");
		
		Scanner sc= new Scanner(System.in);
		
		char ch= sc.next().charAt(0);
		
		//ch=(char)(ch+32);//upper conversion
		ch=(char)(ch-32);//lower conversion
		
	//	System.out.println("Lower conversion is :"+ch);
		System.out.println("Upper conversion is :"+ch);
		
		

	}

}
