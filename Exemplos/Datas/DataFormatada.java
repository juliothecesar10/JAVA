package br.acc.datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFormatada {

	public static void main(String[] args) {
		Date theDateToday = new Date();
		
		//assim ele retorna uma String nesse formato
				
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				
		String data = formatador.format(theDateToday);
		System.out.println(data);
		System.out.println(theDateToday);
	}
}
