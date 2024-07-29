package acc.br.enumeracao;
//Complete Code
public class EnumBasic {
	
//	public enum Seasons {
//		SPRING, SUMMER, FALL, WINTER
//	}
	
	public static void main(String arg[]){
		for(Seasons s : Seasons.values()){
			System.out.println(s);
		}
	}
}
