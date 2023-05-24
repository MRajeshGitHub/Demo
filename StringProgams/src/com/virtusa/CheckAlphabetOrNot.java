package com.virtusa;

import java.util.Scanner;

public class CheckAlphabetOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//check alphabet or not.....
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the character...!");
		char ch=sc.next().charAt(0);
		System.out.println("checking the alphabet or not.....");
		
		if(ch>='A' && ch<='Z' ||ch>='a' && ch<='z')
			System.out.println("alphabet");
		else
			System.out.println("not");
		

	}

}
