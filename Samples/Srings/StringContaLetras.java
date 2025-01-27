package acc.br.strings;

public class StringContaLetras {
	public static void main(String[] args)
	{
		String str1 = "TXcnicas Xe ProXrXmacXo II";
		System.out.println("Total: " + conta_letra(str1, 'X'));
	}
	
	public static int conta_letra(String str, char letra)
	{
	 int i, total = 0;
	 for (i = 0; i < str.length(); i++)
	 	{
		 	if (str.charAt(i) == letra)
		 		total++;
	 	}
	 return total;
	}

}

