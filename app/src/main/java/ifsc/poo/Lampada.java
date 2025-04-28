package ifsc.poo;

public class Lampada {
    private boolean ligada;

    public Lampada(boolean ligada) {
        this.ligada = ligada;
    }

    public Lampada(){
        this.ligada = false;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public boolean verEstado(){
        return ligada;
    }
}
