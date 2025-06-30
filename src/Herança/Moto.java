package Herança;

public class Moto extends Veiculo {

    int Cilindros;

    public Moto(String marca, String modelo, int ano, int cilindros) {
        super(marca, modelo, ano);
        this.Cilindros = cilindros;
    }
    
    void exibirLista(){
        super.lista();
        System.out.println(" A Quantidade de cilindros é: " + Cilindros);
    }

}
