package acc.lambda.sample;
import java.util.*; 
public class StreamSort {
  
	    public static void main(String[] args) 
	    { 
	        List<Integer> list = Arrays.asList(-9, 25, 0, -18, 4); 
	  
	        System.out.println("A stream ordenada é : "); 
 
	        list.stream().sorted().forEach(System.out::println); 
	    } 
}