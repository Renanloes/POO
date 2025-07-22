package Polimorfismo.Override;


public class Main {
    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        gato.emitirSom(); 
        cachorro.emitirSom(); 
    }
}

