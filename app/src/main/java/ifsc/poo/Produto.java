package ifsc.poo;

public class Produto {
    private String codigo;
    private String nome;
    private int preco;
    private double desconto;

    public Produto(String codigo, String nome, int preco, double desconto) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String setDesconto(double desconto) {
        this.desconto = desconto;
        return desconto + "";
    }
    public double precoFinal() {
        return preco * desconto;
    }
    public String anuncio() {
        return nome + " " + preco;
    }

}
