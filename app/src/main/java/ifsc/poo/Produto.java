package ifsc.poo;

public class Produto {
    private static int contador = 0; //count pra ver quantos prod ja foram criados
    private final String codigo;
    private String nome;
    private int preco;
    private double desconto;

    public Produto(String nome, int preco) {
        //verificações
        if(nome == null || nome.trim().isEmpty()){
            System.out.println("Nome invalido");
        }
        if(preco < 0){
            System.out.println("Preço deve ser positivo");
        }
        contador++;
        this.codigo = geraCodigo(contador);
        this.nome = nome;
        this.preco = preco;
        this.desconto = 0.0;
    }
    private String geraCodigo(int numero){ // função tranforma o numero sequencial no formato pedido
        int parte1 = numero / 1000;
        int parte2 = numero % 1000;
        return String.format("CD:%03d-%03d", parte1, parte2);
    }

    public void setDesconto(double desconto) {
        if(desconto < 0 || desconto > 100){
            System.out.println("Desconto invalido");
        }
        this.desconto = desconto;
    }
    public double precoFinal() { // aqui tu vai calcular o preço com desconto aplicado
        return preco * (1 - desconto/100.0);
    }

    public String anuncio() {
        return String.format("%s: de R$ %d,00 por APENAS R$ %.2f!", nome, preco, precoFinal());
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }

}
