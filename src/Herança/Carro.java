package Herança;

public class Carro extends Veiculo {

    int Portas;

    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.Portas = portas;
    }
    
    void exibirLista(){
        super.lista();
        System.out.println(" A Quantidade de portas é: " + Portas);
    }

}
