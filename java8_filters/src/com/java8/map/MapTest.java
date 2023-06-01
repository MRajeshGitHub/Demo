package com.java8.map;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapTest {

	public static void main(String[] args) {
		// It is used to perform./apply the operation of every elements in sequence....
		//It applys in every element
		//Map accepts functon and function is a functionalInteface which hava apply method ...so we can directly apply implementaions..
		
		
		
		//addint every element with 10.
		List<Integer> lst= Arrays.asList(10,20,44,44,5,6,9,8,74,4);
		lst.stream().map(num->num+10).forEach(num->System.out.println(num));
		System.out.println("===================================");
		
		//Taking the List of names: every element add with "Soft" and print the data..
		
		List<String> names=Arrays.asList("Rajesh","vijay","sanjay","vira","divya","gurucharan");
		names.stream().map(name->name+"  Soft").forEach(name->System.out.println(name));
		
		//filter the even element and multiply the all even element with *10
		System.out.println("-----------------------------------");
		List<Integer> list=Arrays.asList(2,2,1,12,12,25,4,6,6,8,9,11,24,52);
		
	list.stream().filter(lis->lis%2==0).map(listt->listt*10).forEach(list1->System.out.println(list1));
	//or
	System.out.println("-----------------------------------");
	
	List<Integer>listdata=list.stream().filter(flist->flist%2==0).map(mlist->mlist*10).collect(Collectors.toList());
	System.out.println(listdata);
				
	System.out.println("=====================");
	
	Set<Integer>listdata1=list.stream().filter(flist->flist%2==0).map(mlist->mlist*10).collect(Collectors.toSet());
	System.out.println(listdata1);

		
		
		
		
		
		
		
		
		
		
		
	}

}
