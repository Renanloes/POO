package Desafio_Encaps_Heran;

public class Cliente extends Pessoa{
    
    private String Codigo;
    
    public Cliente(String nome, int idade, String cpf, String codigo){
        super(nome, idade, cpf);
        this.Codigo = codigo;
    }
    
    void ExibirDados(){
        super.Dados();
        System.out.println("Cliente: " +Codigo);
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }    
}
