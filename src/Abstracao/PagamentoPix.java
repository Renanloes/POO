package Abstracao;

public class PagamentoPix extends Pagamento {

    int taxaPix = 0;
    
    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public void calcularTaxa() {
        System.out.println("O valor da Taxa através do Pagamento em Pix Sairá por: " + taxaPix * getValor());
    }

    @Override
    public void gerarComprovante() {
        System.out.println("O valor total será: " + getValor());
    }

   
}


