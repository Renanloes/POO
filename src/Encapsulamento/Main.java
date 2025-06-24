package Encapsulamento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String titular = "Renan";
        String numeroConta = null;
        Double valor = 0.0;

        contaBancaria conta = new contaBancaria();

        conta.setTitular(titular);
        conta.setNumeroConta(numeroConta);

        System.out.println("Hello, everyone, that is " + conta.getTitular());
        
        depositar(valor);
    }

    public static void depositar(Double valor){
        conta.getSaldo(saldo);
        
    }
}
