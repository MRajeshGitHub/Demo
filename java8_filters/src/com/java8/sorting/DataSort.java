package com.java8.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DataSort {

	public static void main(String[] args) {
		// Collection data sorting in three ways...
		//1.collection.sort//2.list.sort//3.stream.sort
		
		List<String> names=Arrays.asList("shubham","praksh","manjit","ajay","vijay","surya");
		System.out.println(names);
		//using collection.sort sorting.....
		Collections.sort(names);//forward direction...
		System.out.println(names);
		
		Collections.sort(names,Comparator.reverseOrder());//reverce order logic..
		System.out.println(names);//reverce order...
		
		//list.sort...
		System.out.println("--------------------");
		names.sort((name1,name2)->name1.compareTo(name2));
		System.out.println(names);//forward direction
		System.out.println("-----------------");
		names.sort((name1,name2)->-name1.compareTo(name2));
		System.out.println(names);//backdirection....
		
		System.out.println("----------------------------------");
		names.stream().sorted().forEach(name->System.out.println(name));
		//System.out.println(names);
		System.out.println("--------------------------------------------------------------------------------");
		names.stream().filter(name->name.startsWith("s")).sorted((name1,name2)->-name1.compareTo(name2)).forEach(name->System.out.println(name));
		
		
		
	}

}
