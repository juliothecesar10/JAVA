package br.acc.datas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Duracao {

	    public static void main(String[] args) {
			// Creating Durations
	        System.out.println("--- Examples --- ");

	        Duration oneHours = Duration.ofHours(1);
	        System.out.println(oneHours.getSeconds() + " seconds");

	        Duration oneHours2 = Duration.of(1, ChronoUnit.HOURS);
	        System.out.println(oneHours2.getSeconds() + " seconds");

			// Test Duration.between
	        System.out.println("\n--- Duration.between --- ");

	        LocalDateTime oldDate = LocalDateTime.of(2020, Month.AUGUST, 31, 10, 20, 55);
	        LocalDateTime newDate = LocalDateTime.of(2020, Month.NOVEMBER, 9, 10, 21, 56);

	        System.out.println(oldDate);
	        System.out.println(newDate);

	        //count seconds between dates
	        Duration duration = Duration.between(oldDate, newDate);

	        System.out.println(duration.getSeconds() + " seconds");
	        
	        double minutos = duration.getSeconds() / 60;
	        double horas = (duration.getSeconds() / 60) / 60;
	        
	        System.out.println(minutos + " minutos");
	        System.out.println(horas + " horas");

	    }
}
