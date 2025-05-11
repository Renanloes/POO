package Herança;

import Herança.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Carlos", 35, 3000.0);

        System.out.println("Nome: " + f.getNome());
        System.out.println("Idade: " + f.getIdade());
        System.out.println("Salário: R$" + f.getSalario());
    }
}
