package ifsc.poo;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome){
    // impedir nome vazio
    }

    public String getNome(){
    //return nome;
    }

    public void setIdade(int idade){
    // impedir idade negativa
    }

    public int getIdade(){

    }
    public void felizAniversario(){

    }
}
