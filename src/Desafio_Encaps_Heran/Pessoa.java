package Desafio_Encaps_Heran;

public class Pessoa {
    
    private String Nome;
    private int Idade;
    private String CPF;
    
    public Pessoa(String nome, int idade, String cpf){
        this.Nome = nome;
        this.Idade = idade;
        this.CPF = cpf;
    }
    
    void Dados(){
        System.out.println("Pessoa: " + Nome + "\nIdade: " + Idade + "\nCPF: " + CPF);
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
}
