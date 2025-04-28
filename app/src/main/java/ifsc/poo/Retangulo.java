package ifsc.poo;

public class Retangulo {
    private float largura;
    private float altura;
    static Retangulo melhorRetangulo = null;

    public Retangulo(float largura, float altura) {
        this.altura = altura;
        this.largura = largura;
        if(largura < 0 || altura < 0){
            this.largura = 1;
            this.altura = 1;
        } else {
            this.largura = largura;
            this.altura = altura;
        }

        if(melhorRetangulo == null || this.getRazao() > melhorRetangulo.getRazao()){
            melhorRetangulo = this;
        }
    }


    public void setLargura(float largura) {
        if (largura <= 0) {
            this.largura = 1;
        } else {
            this.largura = largura;
        }
    }

    public void setAltura(float altura) {
        if(altura <= 0){
            this.altura = 1;
        } else {
            this.altura = altura;
        }
    }
    public float getArea() {
        return largura * altura;
    }

    public float getPerimetro() {
        return 2*(largura + altura);
    }

    public float getRazao(){
        return getArea() / getPerimetro()               ;
    }

    public static Retangulo getMelhorRetangulo() {
        return melhorRetangulo;
    }

    public float getLargura() {
        return largura;
    }

    public float getAltura() {
        return altura;
    }

}
