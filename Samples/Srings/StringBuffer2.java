package acc.br.strings;

public class StringBuffer2 {
	public static void main(String[] args)
    { 
        StringBuffer s = new StringBuffer("JAVA"); 
        s.append("Linguagem"); 
        System.out.println(s); // returns JAVALinguagem 
        s.append(10); 
        System.out.println(s); // returns JAVALinguagem10 
    }
}

