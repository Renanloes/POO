package Encapsulamento;

public class ContaBancaria {
    
    private String titular;
    private String numeroConta;
    private Double saldo = 1000.0;

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

    public Double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }
}