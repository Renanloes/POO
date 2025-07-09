package Abstracao;

public class PagamentoCartao extends Pagamento {
    
    double valorTaxa;

    public PagamentoCartao(double valor) {
        super(valor);
    }

    @Override
    public void calcularTaxa() {
        valorTaxa = getValor()*0.05;
        System.out.println("A taxa através do pagamento no Cartão sairá por: " + valorTaxa);
    }

    @Override
    public void gerarComprovante() {
        System.out.println("O valor total será: " + (valorTaxa +  getValor()));
    }

    
}
