package Desafio_Encaps_Heran;

public class Funcionario extends Pessoa {

    private String Cargo;

    public Funcionario(String nome, int idade, String cpf, String cargo) {
        super(nome, idade, cpf);
        this.Cargo = cargo;
    }

    void ExibirDados() {
        super.Dados();
        System.out.println("Cliente: " + Cargo);
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
}
