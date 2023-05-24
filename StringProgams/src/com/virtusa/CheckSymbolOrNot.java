package com.virtusa;

import java.util.Scanner;

public class CheckSymbolOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the symbol and check");
		Scanner sc= new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
	
		System.out.println("============================");
		
		if(!(ch>='A' && ch<='Z') &&!(ch>='a'&& ch<='z')  &&!( ch>='0'&& ch<='9'))
			System.out.println("given character is symbol....");
		else
			System.out.println("given character is not symbol.....!");

	}

}
