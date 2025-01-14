package sef.module3.sample;

import java.util.Scanner;  

public class ScannerExemplo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro número: ");
        int first = input.nextInt(); 
        
        if ((first>0) && (first<11)) {
        	System.out.println("Valor entre 1 e 10");
        } else {
        	System.out.println("Valor fora dos limites");
        }
        
        System.out.println("Entre com o segundo número: ");
        int second = input.nextInt();    
        
        System.out.println(first + " + " + second + " = " + (first+second));

        
    }
}
