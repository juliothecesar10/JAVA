package acc.br.enumeracao;

import java.util.stream.Stream;

public class Principaldiasdaseaman {

	public static void main(String[] args) {
//		System.out.println(EnumDiasdaSemana.values());

//		for (EnumDiasdaSemana obj : DiasdaSemana.values()) {
//			System.out.println(obj);
//		    }
		Stream.of(EnumDiasdaSemana.values()).forEach(System.out::println);
//		Stream.of(EnumDiasdaSemana.values())
//			.filter(x -> !x.toString().equals("Terca"))
//			.forEach(System.out::println);
//		System.out.println(EnumDiasdaSemana.Domingo);
	}

}
