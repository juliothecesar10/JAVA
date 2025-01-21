import java.util.Map;

public class EnvironmentVariableReader {

    public static void main(String[] args) {
        // Get a specific environment variable
        String myVariable = System.getenv("GOOGLE_API_KEY");
        System.out.println("Value of MY_VARIABLE: " + myVariable);

        // Get all environment variables
        Map<String, String> allVariables = System.getenv();
        for (Map.Entry<String, String> entry : allVariables.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}