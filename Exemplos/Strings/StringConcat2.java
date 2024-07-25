package acc.strings.sample;

public class StringConcat2 {

    public static void main(String args[]) 
    { 
        String s = "ACC"; 
  
        // We must explicitly assign result 
        // of s.concat() to s.  Since not  
        // assigned to s, s does not change. 
        s.concat("! is the best."); 
  
        System.out.println(s); 
    } 

}
