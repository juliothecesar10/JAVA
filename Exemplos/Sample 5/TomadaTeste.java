package sef.module5.sample;

public class TomadaTeste {

    public static void main(String args[]) {
        TomadaDeTresPinos t3 = new TomadaDeTresPinos();
         
        AdapterTomada a = new AdapterTomada(t3);
        a.ligarNaTomadaDeDoisPinos();
        
        TomadaDeDoisPinos b = new TomadaDeDoisPinos();
        b.ligarNaTomadaDeDoisPinos();

        
    }

}