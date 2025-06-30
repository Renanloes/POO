package Herança;

public class Veiculo {

    public String Marca;
    public String Modelo;
    public int Ano;
    
    public Veiculo(String marca, String modelo, int ano){
        this.Marca = marca;
        this.Modelo = modelo;
        this.Ano = ano;
    }
    
    public void lista(){
        System.out.println(" A Marca do veiculo é: " + Marca + "\n O Modelo do veiculo é: " + Modelo + "\n O Ano do veiculo é: " + Ano);
    }

}
