package Model.Desafio;


public class Efetivo {
    private String nome;
    private double valor;

        
    public Efetivo(String Nome, double Valor){
        this.nome = Nome;
        this.valor = Valor;
    }
    
    public double getValor(){
        return valor;
    }
    
    public void setValor(double Valor) {
        double valorHora = 50.00;
        double bonus = 500;
        this.valor = (valor*valorHora) + bonus;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String Nome){
        this.nome = Nome;
    }

}
