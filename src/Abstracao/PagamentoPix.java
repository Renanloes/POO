package Abstracao;

public class PagamentoPix extends Pagamento {

    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public double calcularTaxa() {
        return 0; // Pix não tem taxa
    }

    @Override
    public boolean processar() {
        // Simula código Pix gerado ou QR lido
        return true;
    }
}


