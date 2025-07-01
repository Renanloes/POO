package Desafio_Encaps_Heran;

public class Main {

    public static void main(String[] args) {
        
        Funcionario f = new Funcionario("Renan", 28, "10239355979", "Desenvolvedor");
        Cliente c = new Cliente("Joana", 35, "10230450678", "CL123");
        
        f.ExibirDados();
        c.ExibirDados();
    }

}
