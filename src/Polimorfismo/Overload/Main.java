package Polimorfismo.Overload;

public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.somar(2, 3));       // 5
        System.out.println(calc.somar(2.5, 3.5));   // 6.0
        System.out.println(calc.somar(1, 2, 3));    // 6

    }
}
