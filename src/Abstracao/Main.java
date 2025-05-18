
package Abstracao;

public class Main {
    public static void main(String[] args) {
        Pagamento p1 = new PagamentoCartao(100.00);
        Pagamento p2 = new PagamentoPix(200.00);

        double total1 = p1.valor + p1.calcularTaxa();
        double total2 = p2.valor + p2.calcularTaxa();

        boolean ok1 = p1.processar(); // retorna true
        boolean ok2 = p2.processar(); // retorna true

        // Aqui você poderia armazenar os resultados em variáveis,
        // enviar para um banco de dados, registrar em log, etc.
    }
}
