package Desafio;

import java.util.Scanner;
import Model.Desafio.Estagiario;
import Model.Desafio.Efetivo;
import Model.Desafio.FreeLancer;

public class Main {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        String funcio = null;
        double horas = 0;

        System.out.println("Qual o nome do Funcionário?\n");
        funcio = input.nextLine();

        System.out.println("Qual foi a carga horária?\n");
        horas = input.nextDouble(); 
      //  Requisicao(funcio, horas);
        Efetivo Efetivo = new Efetivo(funcio, horas);
        System.out.println("Seu nome é: " + Efetivo.getNome() + "\n e possui o saslário de: " + Efetivo.getValor() + "!");
     /*   
        Requisicao(funcio, horas);
        Estagiario Estagio = new Estagiario(funcio, horas);
        System.out.println("Seu nome é: " + Estagio.getNome() + "\n e possui o saslário de: " + Estagio.getHoras() + "!");
              
        Requisicao(funcio, horas);
        FreeLancer Freela = new FreeLancer(funcio, horas);
        System.out.println("Seu nome é: " + Freela.getNome() + "\n e possui o saslário de: " + Freela.getHoras() + "!");
       */ 
    }

    public static void Requisicao(String funcio, double horas) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual o nome do Funcionário?\n");
        funcio = input.nextLine();

        System.out.println("Qual foi a carga horária?\n");
        horas = input.nextDouble(); 

    }

}
