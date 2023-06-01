package com.java8.reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceNumbers {

	public static void main(String[] args) {
		// filter <10:: every element multiply*10 :; Print the addtion all element;
		
		List<Integer> numbers=Arrays.asList(2,7,6,4,10,23,44);
		int result=numbers.stream().filter(number->number<10).map(number->number*10).reduce((number1,number2)-> number1+number2).get();
		System.out.println(result);
	}

}
