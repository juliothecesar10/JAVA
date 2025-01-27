package acc.lambda.sample;

import java.util.ArrayList;
import java.util.List;

public class ParalellStream2 {

	    public static void main(String[] args) {

	        System.out.println("Normal...");

	        List<String> alpha = obtemDados();
	        alpha.stream().forEach(System.out::println);

	        System.out.println("Parallel...");

	        List<String> alpha2 = obtemDados();
	        alpha2.parallelStream().forEach(System.out::println);
	        
	    }
 
	    private static List<String> obtemDados() {

	        List<String> alpha = new ArrayList<>();

	        int n = 97;  // 97 = a , 122 = z
	        while (n <= 122) {
	            char c = (char) n;
	            alpha.add(String.valueOf(c));
	            n++;
	        }

	        return alpha;

	    }

}
