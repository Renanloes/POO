package Polimorfismo.Override;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miando");
    }
}