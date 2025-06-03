package Model.Desafio;


public class Efetivo {
    private String nome;
    private double valor; // representa horas trabalhadas
    private double salario;

    public Efetivo(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
        calcularSalario();  // já calcula no construtor
    }

    private void calcularSalario() {
        double valorHora = 50.00;
        double bonus = 500.00;
        this.salario = (valor * valorHora) + bonus;
    }

    public double getValor() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHoras() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
        calcularSalario(); // recalcula o salário se mudar o valor
    }
}
