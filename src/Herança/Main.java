package Herança;

public class Main {
    public static void main(String[] args) {
        Moto m = new Moto("Honda", "CG 160", 2023, 160);
        Carro c = new Carro("Toyota", "Corolla", 2020, 4);
        
        c.exibirLista();
        m.exibirLista();
    }
}
