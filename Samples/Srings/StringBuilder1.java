package acc.br.strings;

import java.util.List;
import java.util.ArrayList;

public class StringBuilder1 {
	   public static void main(String[] args) {
		    ArrayList<String> list = new ArrayList<String>();
		    list.add("firstName");
		    list.add("middleName");
		    list.add("lastName");
		    
            // Append 
		    StringBuilder sb = new StringBuilder();
            for (String s : list) {
		         sb.append(s);
		         sb.append("\t");
		    }

		    System.out.println(sb.toString());
		    
	        // Delete characters from index 2 to index 5.
	        sb.delete(2, 5);
	        System.out.println(sb); 
	        
	        // Replace second character with "xyz".
	        sb.replace(1, 2, "xyz");
	        System.out.println(sb);
	        
	        //Join
	        StringBuilder builder = new StringBuilder("cat");
	        StringBuilder builder2 = new StringBuilder("dog");

	        builder.append(builder2);
	        System.out.println(builder);
	        
	        // Substring
	        // Get substring after the first 2 characters.
	        String omitFirstTwo = builder.substring(2);
	        System.out.println(omitFirstTwo);

	        // Get only the first 2 characters in a substring.
	        String firstTwo = builder.substring(0, 2);
	        System.out.println(firstTwo);
	        
	        // Loop por caracteres
	        StringBuilder sbu = new StringBuilder("magic");
	        // Loop over the characters in this StringBuilder.
	        for (int i = 0; i < sbu.length(); i++) {
	            System.out.println(sbu.charAt(i));
	        }
	        //--------------------------------------------
	        long t1 = System.currentTimeMillis();

	        // Version 1: appends one-char strings. 
	        StringBuilder sb1 = new StringBuilder();
	        for (int i = 0; i < 1000000; i++) {
	            sb1.append("X");
	        }

	        long t2 = System.currentTimeMillis();

	        // Version 2: appends chars.
	        StringBuilder sb2 = new StringBuilder();
	        for (int i = 0; i < 1000000; i++) {
	            sb2.append('X');
	        }

	        long t3 = System.currentTimeMillis();

	        // ... Times.
	        System.out.println(t2 - t1);
	        System.out.println(t3 - t2);
	   }
}