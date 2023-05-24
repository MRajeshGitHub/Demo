package com.virtusa;

public class ASCIIValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ASCII Values form A-->Z");
		
		
		for(char ch='A';ch<='Z';ch++) {
			System.out.println(ch+"        values is     "+(int)ch);
		}
		System.out.println("=====================");
		System.out.println("small later ASCII");
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch+"    "+(int)ch);
		}
		System.out.println("Digit ASCII");
		for(char ch='0';ch<='9';ch++) {
			System.out.println(ch+"    "+(int)ch);
		}

	}

}
