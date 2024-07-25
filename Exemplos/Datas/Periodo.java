package br.acc.datas;

import java.time.LocalDate;
import java.time.Period;

public class Periodo {

	public static void main(String[] args) {
		LocalDate dataNascimento = LocalDate.of(1984, 6	, 30);
		LocalDate hoje = LocalDate.now();
		Period periodo = Period.between(dataNascimento, hoje);
		
		System.out.println(getAno(dataNascimento, hoje));
		System.out.println(getDia(dataNascimento, hoje));		

	}
	static int getDia(LocalDate dataInicial, LocalDate dataFinal) {
		return getPeriodo(dataInicial, dataFinal).getDays();		
	}
	static int getAno(LocalDate dataInicial, LocalDate dataFinal) {
		return getPeriodo(dataInicial, dataFinal).getYears();		
	}
	static int getMes(LocalDate dataInicial, LocalDate dataFinal) {
		return getPeriodo(dataInicial, dataFinal).getMonths();		
	}
	static Period getPeriodo(LocalDate dataInicial, LocalDate dataFinal) {
		if (dataInicial.isAfter(dataFinal))
			throw new IllegalArgumentException("Data Final menor que a data Incial");
		return Period.between(dataInicial, dataFinal);
	}

}
