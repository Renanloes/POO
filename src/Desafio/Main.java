package Desafio;

import java.util.Scanner;
import Model.Desafio.Estagiario;
import Model.Desafio.Efetivo;
import Model.Desafio.FreeLancer;

public class Main {

    public static void main(String[] args) {
        Funcionario dados = Requisicao();

        String funcio = null;
        double valor = 0;
        

        
        Efetivo efetivo = new Efetivo(dados.getNome(), dados.getValor());
        System.out.println("Seu nome é: " + efetivo.getNome() + "\n e possui o salário de: " + efetivo.getValor() + " como Efetivo!");
        
        Requisicao();
        Estagiario estagio = new Estagiario(dados.getNome(), dados.getValor());
        System.out.println("Seu nome é: " + estagio.getNome() + "\n e possui o salário de: " + estagio.getValor() + " como Estagiário!");
        
        Requisicao();
        FreeLancer freeLa = new FreeLancer(dados.getNome(), dados.getValor());
        System.out.println("Seu nome é: " + freeLa.getNome() + "\n e possui o salário de: " + freeLa.getValor() + " como FreeLancer!");
    }

    public static Funcionario Requisicao() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual o nome do Funcionário?\n");
        String funcio = input.nextLine();

        System.out.println("Qual foi a carga horária?\n");
        double valor = input.nextDouble(); 
        
        return new Funcionario(funcio, valor);
     
    }

}
