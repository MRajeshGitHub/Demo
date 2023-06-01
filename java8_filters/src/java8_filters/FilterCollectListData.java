package java8_filters;

import java.util.List;
import java.util.stream.Collectors;

public class FilterCollectListData {

	public static void main(String[] args) {
		// Collect the List data using Collecters methods....

		System.out.println("Collection the List data using Collectors..!..(5,6,8,3,6,9,2,18,26,22)");
		List<Integer> even=List.of(5,6,8,3,6,9,2,18,26,22);
		List <Integer>coll=even.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(coll);
		
		
	}

}
