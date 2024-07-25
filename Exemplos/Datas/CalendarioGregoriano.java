package br.acc.datas;

import java.util.GregorianCalendar;

public class CalendarioGregoriano {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.get(gc.DAY_OF_WEEK)); //Mostra qual o dia da semana 1 

		System.out.println(gc.isLeapYear(2009)); // imprime falso. 2009 não é bissexto.
		
		gc.add(gc.MONTH, 2); //Adiciona 2 meses à data atual
		System.out.println(gc.MONTH);
		
        System.out.println(gc.getTime());
	
	}
}
