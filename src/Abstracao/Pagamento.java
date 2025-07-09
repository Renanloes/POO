package Abstracao;

public abstract class Pagamento {
    private double Valor;
    
    public Pagamento(double valor){
        this.Valor = valor;
    }
    
    public double getValor(){
        return Valor;
    }
    
    public void setValor(double valor){
        this.Valor = valor;
    }
    
    public abstract void calcularTaxa();
    
    public abstract void gerarComprovante();
}
