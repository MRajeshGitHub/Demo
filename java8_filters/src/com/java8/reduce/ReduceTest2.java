package com.java8.reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceTest2 {

	public static void main(String[] args) {

		// names : filter :; "r" ,"d", ==4,: every name +IT  :: combine the all elements...
		
		List<String> names=Arrays.asList("Rajesh","Raju","dinesh","dayanand","Rohig","dinesh","vijay","pankaj");
		
		names.stream().filter(name->name.startsWith("R") || name.startsWith("d") || name.length()==4).map(name->name+"IT")
		.forEach(name->System.out.println(name));
		System.out.println("==============");
		
	String ss=	names.stream().filter(name->name.startsWith("R") || name.startsWith("d") && name.length()==4).reduce((name1,name2)->name1+name2).get();
		System.out.println(ss);
	}
}
