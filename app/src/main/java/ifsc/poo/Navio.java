package ifsc.poo;

public class Navio {
    private int tamanho;
    private int linhaInicial;
    private int colunaInicial;
    private char orientacao;
    private char letra;
    private boolean[] atingido;
    private boolean afundado;

    public Navio(int tamanho, int linhaInicial, int colunaInicial, char orientacao, char letra) {
        this.tamanho = tamanho;
        this.linhaInicial = linhaInicial;
        this.colunaInicial = colunaInicial;
        this.orientacao = orientacao;
        this.letra = letra;
        this.atingido = new boolean[tamanho];
        this.afundado = false;
    }

    public void receberAtaque(int linha, int coluna) {
        if(orientacao == 'H'){
            if(linha == linhaInicial && coluna >= colunaInicial && coluna < colunaInicial + tamanho){
                int parte = coluna - colunaInicial;
                atingido[parte] = true;
            }
        }
        else if(orientacao == 'V'){
            if(coluna == colunaInicial && linha >= linhaInicial && linha < linhaInicial + tamanho){
                int parte = linha - linhaInicial;
                atingido[parte] = true;
            }
        }

        boolean foiTodoAtingido = true;
        for(boolean parteAtingida : atingido){
            if(!parteAtingida){
                foiTodoAtingido = false;
                break;
            }
        }
        if(foiTodoAtingido){
            afundado = true;
        }
    }

    public boolean estaAfundado() {
        return afundado;
    }

    public boolean foiAtingidoNaParte(int parte){
        if(parte >= 0 && parte < tamanho){
            return atingido[parte];
        } else {
            return false;
        }
    }

    public String mostrarEstado() {
        String resultado = "";

        for(int i = 0; i < tamanho; i++){
            if(atingido[i]){
                resultado += "X ";
            } else {
                resultado += letra + " ";
            }
        }

        return resultado.trim();
    }
}
