package br.acc.datas;
// Java code to demonstrate 
// setTime() function of Date class 

import java.util.Date; 
import java.util.Calendar; 

public class Calendario {

		// main method 
		public static void main(String[] args) 
		{ 
			// creating a Calendar object 
			Calendar c1 = Calendar.getInstance(); 

			// set Month 
			// MONTH starts with 0 i.e. ( 0 - Jan) 
			c1.set(Calendar.MONTH, 11); 

			// set Date 
			c1.set(Calendar.DATE, 05); 

			// set Year 
			c1.set(Calendar.YEAR, 1996); 

			// creating a date object with specified time. 
			Date dateOne = c1.getTime(); 

			System.out.println("Date initially: "
							+ dateOne); 

			// Sets the time 
			dateOne.setTime(1000999); 

			// Prints the time 
			System.out.println("Date after setting"
							+ " the time: "
							+ dateOne); 
	} 
} 

