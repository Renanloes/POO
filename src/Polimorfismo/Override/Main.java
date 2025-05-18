package Polimorfismo.Override;

import Polimorfismo.Override.Gato;
import Polimorfismo.Override.Cachorro;
import Polimorfismo.Override.Animal;

public class Main {
    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        gato.emitirSom(); // Latindo
        cachorro.emitirSom(); // Miando
    }
}

