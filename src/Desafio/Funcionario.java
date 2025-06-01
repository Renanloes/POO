package Desafio;

public abstract class Funcionario {

    private String nome;
    private Double horas;

    public void calcularSalario(String nome, Double horas) {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getHoras() {
        return horas;
    }

    public void setHoras(Double horas) {
        this.horas = horas;
    }

}
