package Abstracao;

public class PagamentoCartao extends Pagamento {

    public PagamentoCartao(double valor) {
        super(valor);
    }

    @Override
    public double calcularTaxa() {
        return valor * 0.05; // 5% de taxa
    }

    @Override
    public boolean processar() {
        // Simula verificação de saldo ou aprovação
        return true; // aprovado
    }
}
