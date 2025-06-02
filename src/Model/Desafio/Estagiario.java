package Model.Desafio;

import Desafio.Funcionario;

public class Estagiario extends Funcionario {
    

    public Estagiario(String Nome, double Valor) {
        super(Nome, Valor);
    }
    
    @Override
    public String Nome(String nome) {
        return getNome();
    }

    @Override
    public double Valor(double finalEstagio) {
        finalEstagio = 0.8;
        return getHoras()*finalEstagio;
    }

}
