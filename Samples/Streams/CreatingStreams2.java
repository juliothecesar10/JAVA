package acc.lambda.sample;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class CreatingStreams2 {

    public static void main(String[] args) {
        
        IntStream integers = IntStream.rangeClosed(1, 16);
        System.out.println(integers.average().getAsDouble());
        // A stream of integers is created with the IntStream.rangeClosed() method. 
        // We print their average to the console.
        
        DoubleStream doubles = DoubleStream.of(2.3, 33.1, 45.3);
        doubles.forEachOrdered(e -> System.out.println(e));
        // A stream of double values is created with the DoubleStream.of() method. 
        // We print the ordered list of elements to the console utilizing the forEachOrdered() method.
    
        LongStream longs = LongStream.range(6, 25);
        System.out.println(longs.count());
        // A stream of long integers is created with the LongStream.range() method. 
        // We print the count of the elements with the count() method
    }
} 
