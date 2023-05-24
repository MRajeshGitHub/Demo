package com.virtusa;

import java.util.Scanner;

public class CheckVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Check the input Alphabet Vowel or Not...");
		
		Scanner sc= new Scanner(System.in);
		
		char ch=sc.next().charAt(0);
		
		if(ch=='a' ||ch=='e'||ch=='i' || ch=='o'||ch=='o')
			System.out.println("input is vowel");
		else
			System.out.println("not vowel");

	}

}
