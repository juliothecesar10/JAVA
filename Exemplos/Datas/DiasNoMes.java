package br.acc.datas;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DiasNoMes {
    /**
     * Recuperar a quantidade de dias no mês
     * 
     * @param mes Mês que deseja saber a quantidade de dias
     * @return quantidade de dias
     */
    public static int getQuantidadeDiasByMes(int mes){
        Calendar datas = new GregorianCalendar();
        datas.set(Calendar.MONTH, mes-1);//2
        int quantidadeDias = datas.getActualMaximum (Calendar.DAY_OF_MONTH);  
        return quantidadeDias ;
    }
    
	public static void main(String[] args) {
		System.out.println(getQuantidadeDiasByMes(1));
	}
}
