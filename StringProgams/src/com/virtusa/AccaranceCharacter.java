package com.virtusa;

public class AccaranceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("String accurance tesing in given Words....");
		
		String s="sssjjjgggiiidckjgolfjkjjj&&&&%%%$$$$";
		
		int arr[]=new int [256];//array declearation with defoult values....
		//for(int i=0;i<arr.length;i++)
	//	System.out.println(arr[i]);
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			int x=ch;
			arr[x]++;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.println((char)i+"===="+arr[i]);
			}
		}
		
		
		
		

	}

}
