package com.virtusa;

public class StringSpaceRemv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="This      is       a     String";
		
		//using regular exp we can solve this task
		
	//	str=str.replaceAll("\\s+", " ");
		str=str.replaceFirst("\\s+", " ");
		System.out.println(str);

	}

}
