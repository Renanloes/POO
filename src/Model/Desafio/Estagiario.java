package Desafio;

public class Estagiario extends Funcionario {
    
    double valorHora = 0.8;
    
    public Estagiario(String Nome, double Valor) {
        super(Nome, Valor);
    }
    
    @Override
    public String Nome(String nome) {
        return getNome();
    }

    @Override
    public double Valor(double finalEstagio) {
        return getHoras()*finalEstagio;
    }

}
