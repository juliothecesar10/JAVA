package acc.br.strings;

public class StringBuffer3 {
	public static void main(String[] args)
    { 
        StringBuffer s = new StringBuffer("123456789"); 
        s.insert(4, "for"); 
        System.out.println(s); // returns 1234for56789 
  
        s.insert(0, 4); 
        System.out.println(s); // returns 41234for56789 
  
        s.insert(3, true); 
        System.out.println(s); // returns 412true34for56789 
  
        s.insert(5, 41.35d); 
        System.out.println(s); // returns 412tr41.35ue34for56789
  
        char vetor[] = { 'p', 'a', 'w', 'a', 'n' }; 
        
        // insert character array at offset 9 
        s.insert(2, vetor); 
        System.out.println(s); // returns 41pawan2tr41.35ue34for56789
        
        s.reverse(); 
        System.out.println(s); // returns 98765rof43eu53.14rt2nawap14 
        
        s.delete(0, 5); 
        System.out.println(s); // returns rof43eu53.14rt2nawap14 
        
        s.deleteCharAt(7); 
        System.out.println(s); // returns rof43eu3.14rt2nawap14
        
        // Solicitar aos alunos que pesquisem como reiniciar o valor de s;
        // s = "123456789";
        s.replace(5, 8, "are"); 
        System.out.println(s); // returns rof43are.14rt2nawap14
        
//        s = "alterar a conteúdo da string por este novo";
    }
}