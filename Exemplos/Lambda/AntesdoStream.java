package acc.lambda.sample;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AntesdoStream {

	public static void main(String[] args) {
 
        List<String> lines = Arrays.asList("spring", "node", "acc");
 
        List<String> result = getFilterOutput(lines, "acc");
        
        for (String temp : result) {
            System.out.println(temp);    //output : spring, node
        }

    }

    private static List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();
        
        for (String line : lines) {
            if (!"acc".equals(line)) { 
                result.add(line);
            }
        }
        return result;
    }

}