package acc.lambda.sample;

import java.util.*; 

public class ParalleStream3 {
    
    public static void main(String[] args) throws Exception {   
        List<String> arr1 = new ArrayList<String>(); 
        arr1.add("Google"); 
        arr1.add("Acc"); 
        arr1.add("Apple"); 
        arr1.add("Microsoft"); 
  
        arr1.parallelStream()
            .forEach(s -> System.out.print(s+ " ") ); 
    } 
}
