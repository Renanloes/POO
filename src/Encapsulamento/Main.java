package Encapsulamento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        String titular = "Renan";
        String numeroConta = null;
        Double valor = 0.0;
        
        int botao = 0;
        String mensagem = "O que você deseja fazer " + titular + "\n\n" + "1 - Depositar\n" + "2 - Sacar\n" + "3 - Saldo atual\n" + "4 - Sair\n";

        contaBancaria conta = new contaBancaria();

        conta.setTitular(titular);
        conta.setNumeroConta(numeroConta);

        System.out.println("Hello, everyone, that is " + conta.getTitular());
        
        
        while(botao != 4){
            
            System.out.println(mensagem);
            botao = input.nextInt();
            
            switch(botao){
                case 1:
                    Depositar();
                    break;
                
                case 2:
                    Sacar();
                    break;
                    
                case 5:
                    conta.getsaldo(valor);
                    break;
                    
                case 4:
                    System.out.println("Até a próxima " + titular);
                    break;
                    
                default:
                    System.out.println("Escolha uma das opções existentes");
                    botao = 0;
                    break;
            }
        }
    }
}
