package br.acc.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DataHoraLocal {

	public static void main(String[] args) {
	    LocalDateTime myObj2 = LocalDateTime.now();   // iso8601
	    System.out.println(myObj2);
	    
	    System.out.println("Dia da semana: " + myObj2.getDayOfWeek().name());
	    System.out.println("Dia da semana: " + myObj2.getDayOfWeek().getValue());
	    System.out.println("Mes: " + myObj2.getMonthValue());
	    System.out.println("Mes: " + myObj2.getMonth().name());
	    System.out.println("Ano: " + myObj2.getYear());
	   
	    LocalDate myObj = LocalDate.now(); // Create a date object
		System.out.println(myObj); // Display the current date
	    
		LocalTime myObj1 = LocalTime.now();
	    System.out.println(myObj1);

	}

}
