package Polimorfismo.Override;

import Polimorfismo.Override.Animal;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miando");
    }
}