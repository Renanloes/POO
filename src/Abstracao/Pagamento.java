package Abstracao;

public abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public abstract double calcularTaxa();
    public abstract boolean processar();
}
