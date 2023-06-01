package java8_filters;

import java.util.List;

public class CountElementFilter {

	public static void main(String[] args) {
		// Count the list data usint filters...
		
		System.out.println("Collection the List data using Collectors..!..(5,6,8,3,6,9,2,18,26,22)");
		List<Integer> even=List.of(5,6,8,3,6,9,2,18,26,22);

		long count=even.stream().filter(i->i%2==0).count();
		System.out.println("Total number of count in given List after filter the list is :"+count);
		
		System.out.println("Get the first Element of the list...");
		int firstEle=even.stream().findFirst().get();
		System.out.println(firstEle);
		
		System.out.println("Skipe the Element depends of the users inputs...");
		int firstElem=even.stream().skip(3).findFirst().get();
		System.out.println(firstElem);
		
		
		
		
		
		
		
		
		
		
	}

}
