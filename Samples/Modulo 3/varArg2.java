package sef.module3.sample;

public class varArg2 {

	  public static String tresPontos(String...i){
	    String frase = "";
	    for (String s : i) {
	      frase += s;
	    }
	    return frase;
	  }

	  public static void main(String[] args) {
	    System.out.println("Resultado: " + tresPontos("Naquele ", "dia"));
	  }
}