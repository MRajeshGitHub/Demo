package java8_filters;

import java.util.List;

public class FilterLIstNumbers {

	public static void main(String[] args) {
		// Filter the data using List....!
		//Filter is used to filter the data based on the given conditions.
		//filter is Functional Interface which have test methods...
		//to perform the filter we need to implements test method using lamda .
		
		// Filter the List data in even numbers.
		
		System.out.println("Givern List Intgers value convert into Even data...(5,6,8,3,6,9,2,18,26,22)");
		List<Integer> numbers=List.of(5,6,8,3,6,9,2,18,26,22);
		//use stream //filter/forEach to print the data....
		numbers.stream().filter(i->i%2==0).forEach(number->System.out.println(number));
	
			
		

	}

}
