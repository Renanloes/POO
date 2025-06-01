package Desafio;

public class FreeLancer extends Funcionario {
    
    double valorHora = 50.00;
    
    public FreeLancer(String Nome, double Valor) {
        super(Nome, Valor);
    }
    
    @Override
    public String Nome(String nome) {
        return getNome();
    }

    @Override
    public double Valor(double valorHora) {
        return (getHoras()*valorHora);
    }

}
