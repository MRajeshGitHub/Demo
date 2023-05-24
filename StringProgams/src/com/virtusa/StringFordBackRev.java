package com.virtusa;

public class StringFordBackRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String forword and backword and reverve direction.....
		
		
		String str="Rajesh Kumar Majhi";
		
		int len=str.length();
		
		for(int i=0;i<len;i++) {
			//System.out.println(str.charAt(i));
			System.out.println(str.charAt(len-1));
		}
		//reverve...
		System.out.println("----------------------------------");
		for(int i=len-1;i>=0;i--) {
			System.out.println(str.charAt(i));
		}
	}

}
