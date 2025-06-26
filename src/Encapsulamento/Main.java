package Encapsulamento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        String titular = null;
        String numeroConta = null;

        Double valor;
        
        int botao = 0;
        String mensagem = "O que você deseja fazer \n\n" + "1 - Depositar\n" + "2 - Sacar\n" + "3 - Saldo atual\n" + "4 - Sair\n";
        
        
        System.out.println("Forneça seus dados \n Titular");
        titular = input.nextLine();

        System.out.println("Número da Conta");
        numeroConta = input.nextLine();
        
        ContaBancaria conta = new ContaBancaria();


        conta.setTitular(titular);
        conta.setNumeroConta(numeroConta);

        System.out.println("Hello, " + conta.getTitular());
        
        
        while(botao != 4){
            
            System.out.println(mensagem);
            botao = input.nextInt();
            
            switch(botao){
                case 1:
                    Depositar(conta);
                    break;
                
                case 2:
                    Sacar(conta);
                    break;
                    
                case 3:
                    System.out.println("Seu saldo Atual é de "+ conta.getSaldo());
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
    
    public static void Depositar(ContaBancaria conta){
        Double deposito;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quanto deseja Depositar?\n");        
        deposito = scanner.nextDouble();
        
        if(deposito > 0){
            conta.setSaldo(deposito + conta.getSaldo());
            System.out.println("Depositado com Sucesso");
        }else{
            System.out.println("Inconcistencia na execução do processo, tentado depositar valor negativo na conta\n Tente Novamente");
        }
    };
    
    public static void Sacar(ContaBancaria conta){
        Double saque;
        
        Scanner scanner = new Scanner(System.in);         
        
        System.out.println("Quanto deseja sacar?");
        saque = scanner.nextDouble();
        
        if(saque <= conta.getSaldo()){
            conta.setSaldo(conta.getSaldo() - saque);
            System.out.println("Saque realizado com sucesso");
        }else{
            System.out.println("Saldo Atual insuficiente");
        }
    };
}
