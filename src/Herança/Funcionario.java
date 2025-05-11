package Herança;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade); // chama o construtor da classe Pessoa
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
