package acc.br.strings;

public class StringBuffer1 {
	public static void main(String[] args)
	{
	 StringBuffer s1 = new StringBuffer("BOTAFOGO");
     
	 s1.append(" - RJ");

	 s1.insert(s1.indexOf("- ")+1, " BFX -");
	 	 
	 s1.setCharAt(s1.indexOf("X"), 'R');
	 
	 System.out.println(s1);
	 s1.replace(11, 14, "BBB");
	 System.out.println(s1);
	}
}

