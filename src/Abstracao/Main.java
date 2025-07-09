
package Abstracao;

public class Main {
    public static void main(String[] args) {
        Pagamento PagCar = new PagamentoCartao(100.00);
        Pagamento PagPix = new PagamentoPix(200.00);
        
        PagPix.calcularTaxa();
        PagPix.gerarComprovante();
        
        PagCar.calcularTaxa();
        PagCar.gerarComprovante();
    }
}
