package com.java8.reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceTest {

	public static void main(String[] args) {
		// Reduce method perform the operation on all elements return one values.
		//Reduce method will take binaryOperator argument with apply method to implements
		
		List<Integer> prices=List.of(56,34,56,78,23,200,12);
		int res=prices.stream().reduce((i,j)->(i+j)).get();
		System.out.println(res);

	}

}
