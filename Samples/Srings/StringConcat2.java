package acc.br.strings;

public class StringConcat2 {

    public static void main(String args[]) 
    { 
        String s = "ACC"; 
  
        // Precisamos explicitamente atribuir    
        // o valor do s.concat() � s.     
        // Caso contr�rio o s, n�o muda. 
        s.concat("! is the best."); 
  
        System.out.println(s); 
        System.out.println(s.concat("! is the best.")); 
    } 

}
