package Encapsulamento;

public class contaBancaria {
    
    private String titular;
    private String numeroConta;
    private Double saldo = 0.0;
    double valor;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getsaldo(Double saldo){
        return saldo;
    }
}