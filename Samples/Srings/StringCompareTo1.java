package acc.br.strings;

public class StringCompareTo1 {

	   public static void main(String args[]) {
	       	String str1 = "String method tutorialx";
	       	String str2 = "compareTo method example";
	       	String str3 = "String method tutoriala";

	       	int var1 = str1.compareTo( str2 );
	       	System.out.println("str1 & str2 comparison: "+var1);

	       	int var2 = str1.compareTo( str3 );
	       	System.out.println("str1 & str3 comparison: "+var2);

	       	int var3 = str2.compareTo("compareTo method example");
	       	System.out.println("str2 & string argument comparison: "+var3);
	       	
	   		//--------------------------------------------------------------------       
	   		str1 = "Azul"; 
	   		//This is an empty string
	   		str2 = "";
	   		str3 = "Goat";
			
	   		System.out.println(str1.compareTo(str2));

	   		System.out.println(str1.compareTo(str3));
	   		//--------------------------------------------------------------------
	   		//uppercase
	   		str1 = "HELLO"; 
	   		//lowercase
	   		str2 = "hello";
	   			
	   		System.out.println(str1.compareTo(str2));
	   		
	   }
}