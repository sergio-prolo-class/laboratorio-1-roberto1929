package ifsc.poo;

public class Pessoa {
    private String nome;
    private int idade;
    static int totalPessoas = 0;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        totalPessoas++;
    }

    public Pessoa(String nome) {
        idade = 0;
        this.nome = nome;
        totalPessoas++;
    }

    public Pessoa(int idade) {
        nome = "Desconhecido";
        this.idade = idade;
        totalPessoas++;
    }

    public void setNome(String nome){
    if(nome.trim().isEmpty()){
        System.out.printf("Nome vazio\n");
    } else {
        this.nome = nome;
        }
    }

    public String getNome(){
    return nome;
    }

    public void setIdade(int idade){
    if(idade >= 0){
        this.idade = idade;
        } else {
        System.out.printf("Idade negativa\n");
        }
    }

    public int getIdade(){
    return idade;
    }

    public void felizAniversario(){
    idade++;
    }
}
