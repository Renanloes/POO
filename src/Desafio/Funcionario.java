package Desafio;

public abstract class Funcionario {

    private String nome;
    private double horas;

    public Funcionario(String nome, double horas) {
        this.nome = nome;
        this.horas = horas;
    }

    public abstract String Nome(String Nome);

    public abstract double Valor(double Valor);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

}
