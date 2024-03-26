package com.java8.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NumberSort {

	public static void main(String[] args) {
		// Number sorting with use cases....
		
		List<Integer> numbers=Arrays.asList(5,4,3,7,823,34,45,67);
		//collection sort in assending and deceding order...
		
		Collections.sort(numbers);
		System.out.println(numbers);//acending order
		Collections.sort(numbers, Comparator.reverseOrder());
		System.out.println(numbers);

		System.out.println("--------------------------");
		//list sorting...
		
		numbers.sort((num1,num2)->num1.compareTo(num2));
		System.out.println(numbers);
		System.out.println("==================");

		numbers.sort((num1,num2)->-num1.compareTo(num2));
		System.out.println(numbers);
		
		System.out.println("=========================");
		//sorting using stream()...
		
		numbers.stream().sorted().forEach(num->System.out.println(num));
		//System.out.println(numbers);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
		numbers.stream().sorted((numm1,numm2)->-numm1.compareTo(numm2)).forEach(num->System.out.println(num));
		//System.out.println(numbers);
		System.out.println("==============================");
		//Stresm sort with filters
		
		numbers.stream().filter(num->num<10).map(num->num*10).forEach(num->System.out.println(num));
		System.out.println("+++++++++++++");
		numbers.stream().filter(num->num<10).map(num->num*10).sorted((num1,num2)->num1.compareTo(num2)).forEach(num->System.out.println(num));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
