package br.acc.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
	
	public static void main(String[] args) {
		String stringData = "30/12/2020";
		SimpleDateFormat formatadorDeDatas = new SimpleDateFormat("DD/MM/YYYY");
		Date data = null;
		try {
			data = formatadorDeDatas.parse(stringData);
		} catch (ParseException e){
			e.printStackTrace();
		}
		System.out.println(data);
	}

}
