package Aula05a;

public class Ingresso {
    protected float valor = 100.0f;

    public void imprimeValor(){
        System.out.println("Valor do ingresso R$ " + getValor());
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
