package acc.br.strings;

public class StringEndsWith {

	public static void main(String[] args) {
	    System.out.println("-----------------endsWith----------------------------- ");
	    String str1 = new String("This is a test String");
	    String str2 = new String("Test ABC");
	    boolean var1 = str1.endsWith("String");
	    boolean var2 = str2.endsWith("String");
	    boolean var3 = str1.endsWith("ABC");
	    boolean var4 = str2.endsWith("ABC");
	    System.out.println("str1 ends with String: "+ var1);
	    System.out.println("str2 ends with String: "+ var2);
	    System.out.println("str1 ends with ABC: "+ var3);
	    System.out.println("str2 ends with ABC: "+ var4);
	    
	    //-----------------startsWith-----------------------------   
	    System.out.println("-----------------startsWith----------------------------- ");
	   	String s = "This is just a sample string";  

	   	//checking whether the given string starts with "This"
	   	boolean teste1 = s.startsWith("This");
	   	if (teste1) {
		   	System.out.println("Verdadeiro");  
	   	} else {
	   		System.out.println("Falso");
	   	}
	   	
	   	//checking whether the given string starts with "Hi"

	   	System.out.println(s.startsWith("Hi"));
	
	}
}