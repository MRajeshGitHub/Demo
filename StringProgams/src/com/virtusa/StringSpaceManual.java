package com.virtusa;

public class StringSpaceManual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="This        is        a      String";
		String s1="";
		
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			if(ch!=' ') {
				s1=s1+ch;
			}
			else
			{
				char ch1=s1.charAt(i+1);
				if(ch1==' ') {
					continue;
				}
				else {
					s1=s1+ch1;
				}
			}
		}
		System.out.println(s1);

	}

}
