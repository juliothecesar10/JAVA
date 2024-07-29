package acc.br.enumeracao;

public class EnumPeriodoCurso {

    enum Periodo { MANHA, TARDE, NOITE};
    
    public static void main(String[] args) {
        Periodo periodoCurso;
        periodoCurso = Periodo.TARDE;
        System.out.println((periodoCurso));
 
    }
}