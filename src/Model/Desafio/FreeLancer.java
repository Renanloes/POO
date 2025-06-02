package Model.Desafio;

import Desafio.Funcionario;

public class FreeLancer extends Funcionario {
    

    public FreeLancer(String Nome, double Valor) {
        super(Nome, Valor);
    }
    
    @Override
    public String Nome(String nome) {
        return getNome();
    }

    @Override
    public double Valor(double valorHora) {
        valorHora = 50.00;
        return (getHoras()*valorHora);
    }

}
