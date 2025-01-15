package sef.module4.sample;

public class GarbageCollect {

	public static void main(String[] args) {
		Contato[] contatos = new Contato[10000000];
			
		for (int i=0; i< contatos.length; i++) {
			Contato contato = new Contato("Contato"+ i, "12345-67890"+i, "contato"+i+"@email.com");
			contatos[i] = contato;
		}
		System.out.println("Contatos criados");
		
        obterMemoriaUsada();
		
		contatos = null;
		Runtime.getRuntime().runFinalization();
		Runtime.getRuntime().gc();
		System.out.println("Contatos removidos da memoria");
		
		obterMemoriaUsada();	
		
	}

	public static void obterMemoriaUsada() {
		final int MB = 1024 * 1024; // MegaByte
		Runtime runtime = Runtime.getRuntime();
		long memoriaUsada = (runtime.totalMemory() - runtime.freeMemory() ) / MB;
		System.out.println("Memoria usada = " +memoriaUsada + " MB");
	}
	
}
