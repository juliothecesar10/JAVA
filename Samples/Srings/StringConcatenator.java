package acc.br.strings;

public class StringConcatenator {

    public static String concatenateStrings(String... strings) {
        // Create an empty StringBuilder to efficiently build the concatenated string
        StringBuilder result = new StringBuilder();

        // Iterate through the array of strings
        for (String str : strings) {
            result.append(str); 
        }

        // Return the concatenated string
        return result.toString();
    }

    public static void main(String[] args) {
        String result1 = concatenateStrings("Hello", " ", "World", "!");
        System.out.println(result1); // Output: "Hello World!"

        String result2 = concatenateStrings("Java", " ", "is", " ", "fun");
        System.out.println(result2); // Output: "Java is fun"

        String result3 = concatenateStrings();
        System.out.println(result3); // Output: "" 
    }
}