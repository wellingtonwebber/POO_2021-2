package Aula05a;

public class IngressoVIP extends Ingresso{


    @Override
    public void imprimeValor(){
        System.out.println("Valor do ingresso VIP R$ " + (getValor()));
    }

    @Override
    public float getValor() {
        return super.getValor() * 1.5f;
    }
}
