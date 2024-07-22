package sef.module17.sample;

import junit.framework.TestCase;

public class TesteParOuImpar extends TestCase {

	public void testParOuImpar(){
		int valor = 19;
        ParOuImpar meo = new ParOuImpar();
        assertEquals("19 é um numero par", true, meo.ePar(valor));
    }

}
