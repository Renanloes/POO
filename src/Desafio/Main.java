package Desafio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String funcio = null;
        double horas = 0;

        Requisicao(funcio, horas);
        Funcionario Efetivo = new Efetivo(funcio, horas);
        System.out.println("Seu nome é: " + funcio + "\n e possui o saslário de: " + horas);
        
        Requisicao(funcio, horas);
        Funcionario Estagio = new Estagiario(funcio, horas);
        System.out.println("Seu nome é: " + funcio + "\n e possui o saslário de: " + horas);
              
        Requisicao(funcio, horas);
        FreeLancer Freela = new FreeLancer(funcio, horas);
        System.out.println("Seu nome é: " + funcio + "\n e possui o saslário de: " + horas);
        
    }

    public static void Requisicao(String funcio, double horas) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual o nome do Funcionário?\n");
        funcio = input.nextLine();
        input.close();

        System.out.println("Qual foi a carga horária?\n");
        horas = input.nextDouble(); 
        input.close();
    }

}
