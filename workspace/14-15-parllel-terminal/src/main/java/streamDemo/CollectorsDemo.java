
package streamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		List<Integer> twoEvenSquares = 
		    numbers.parallelStream()
		           .filter(n -> {
		                    System.out.println("filtering " + n); 
		                    return n % 2 == 0;
		                  })
		           .map(n -> {
		                    System.out.println("mapping " + n);
		                    return n * n;
		                  })
		           .limit(2)
		           .collect(Collectors.toList());
		
		System.out.println("Two even numbers :");
		System.out.println(twoEvenSquares);
		
		System.out.println("Numbers");
		System.out.println(numbers);
	}
}










/*

filtering 1
filtering 2
mapping 2
filtering 3
filtering 4
mapping 4

This is because limit(2) uses short-circuiting; 
we need to process only part of the stream, 
not all of it, to return a result. 
This is similar to evaluating a large Boolean expression chained 
with the and operator: 
as soon as one expression returns false, we can deduce that the whole expression 
is false without evaluating all of it. 

Here, the operation limit returns a stream of size 2. 

The Streams API will internally decompose your query to leverage the multiple cores on 
your computer.

In addition, the operations filter and map have been merged in the same pass.

*/