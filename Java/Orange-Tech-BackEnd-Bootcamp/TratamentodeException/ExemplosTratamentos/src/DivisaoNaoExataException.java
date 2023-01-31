

public class DivisaoNaoExataException extends Exception{

    private int numerado;
    public int getNumerado() {
        return numerado;
    }

    public void setNumerado(int numerado) {
        this.numerado = numerado;
    }

    private int denominador;

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public DivisaoNaoExataException (String message, int numerado, int denominador){
        super(message);
        this.numerado = numerado;
        this.denominador = denominador;
    }
    
}
