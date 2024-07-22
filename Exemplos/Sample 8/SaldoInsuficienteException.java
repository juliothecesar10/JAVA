package sef.module8.sample;

public class SaldoInsuficienteException  extends RuntimeException {    

    public SaldoInsuficienteException(String message) {
        super(message);
    }
}