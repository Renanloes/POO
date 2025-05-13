package Polimorfismo;

import Polimorfismo.Gato;
import Polimorfismo.Cachorro;
import Polimorfismo.Animal;

public class Main {
    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        gato.emitirSom(); // Latindo
        cachorro.emitirSom(); // Miando
    }
}

