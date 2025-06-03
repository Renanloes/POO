package Desafio;

public class Funcionario {

    String nome;
    double valor;

    public Funcionario(String Nome, double Valor) {
        this.nome = Nome;
        this.valor = Valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double Valor) {
        this.valor = Valor;
    }

}
