package Aula05c;

public class Circulo implements Forma {

    protected double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2d * 3.14d * raio;
    }

    @Override
    public double calcularArea() {
        return 3.14d * raio * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
