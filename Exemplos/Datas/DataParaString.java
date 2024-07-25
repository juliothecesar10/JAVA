package br.acc.datas;

import java.util.Date;

public class DataParaString {

	public static void main(String[] args) {
		Date dataDeHoje = new Date();
		
		String data = "" + dataDeHoje;
		
		System.out.println(data);

	}

}
