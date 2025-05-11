package Encapsulamento;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Quantas pessoas deseja cadastrar?");
        int qtd = entrada.nextInt();
        entrada.nextLine(); // limpar buffer

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String nome = entrada.nextLine();

            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            int idade = entrada.nextInt();
            entrada.nextLine(); // limpar buffer

            Pessoa p = new Pessoa(nome, idade);
            pessoas.add(p);
        }

        System.out.println("\nLista de pessoas cadastradas:");
        for (Pessoa p : pessoas) {
            p.apresentar();
        }

        entrada.close();
    }
}