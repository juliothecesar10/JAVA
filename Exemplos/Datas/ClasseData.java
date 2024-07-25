package br.acc.datas;

//Program to demonstrate methods of Date class 
import java.util.Date; 

public class ClasseData {

	public static void main(String[] args) 
    { 
        // Creating date 
        Date d1 = new Date(2000-1900, 11, 21); 
        Date d2 = new Date();  // Current date 
        Date d4 = new Date();  // Current date 
        Date d3 = new Date(2010-1900, 1, 3); 
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);        
        boolean a = d3.after(d1); 
        System.out.println("Date d3 comes after " + 
                           "date d1: " + a); 
  
        boolean b = d3.before(d2); 
        System.out.println("Date d3 comes before "+ 
                           "date d2: " + b); 
  
        int c = d1.compareTo(d2); 
        System.out.println(c); 
  
        System.out.println("Miliseconds from Fev 3 "+ 
                "2010 to date d1 is " + d1.getTime()); 
  
        System.out.println("Before setting "+d2); 
        d2.setTime(204587433443L); 
        System.out.println("After setting "+d2); 
    } 
}