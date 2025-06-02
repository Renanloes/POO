package Desafio;

public class Efetivo extends Funcionario {
    
    double valorHora = 50.00;
    
    public Efetivo(String Nome, double Valor) {
        super(Nome, Valor);
    }
    
    @Override
    public String Nome(String nome) {
        return getNome();
    }

    @Override
    public double Valor(double valorHora) {
        double bonus = 500;
        return (getHoras()*valorHora) + bonus;
    }

}
