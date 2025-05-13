package Polimorfismo;

import Polimorfismo.Animal;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miando");
    }
}