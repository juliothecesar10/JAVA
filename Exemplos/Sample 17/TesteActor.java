package sef.module17.sample;

import junit.framework.TestCase;

public class TesteActor extends TestCase {

	Actor actor = new Actor();

    public void testSetAndGetActor() {
        assertNull(actor.getFirst_Name());
        
        String testeFirst_Name = "PENELOPE";
        actor.setFirst_Name(testeFirst_Name);

        assertEquals("PENELOPE", actor.getFirst_Name());
//        assertEquals(testeFirst_Name, actor.getFirst_Name());
        
        System.out.println(actor.getFirst_Name());
    }
}
