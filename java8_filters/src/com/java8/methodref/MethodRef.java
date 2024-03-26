package com.java8.methodref;

import java.util.Arrays;
import java.util.List;

public class MethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=Arrays.asList("Rajesh","vijay","sanjay","praksh","viru","divya");
		names.forEach(name->System.out.println(name));
		
		System.out.println("+++++++++++++++++++++");
		
		//using method reference
		
		names.forEach(System.out::println);

	}


}
