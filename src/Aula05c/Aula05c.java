package Aula05c;

public class Aula05c {
    public static void main(String[] args) {

        Quadrado quad = new Quadrado(3);
        System.out.println(quad.calcularArea());
        System.out.println(quad.calcularPerimetro());

        Retangulo ret = new Retangulo(2, 3);
        System.out.println(ret.calcularArea());
        System.out.println(ret.calcularPerimetro());

        Circulo c1 = new Circulo(5);
        System.out.println(c1.calcularArea());
        System.out.println(c1.calcularPerimetro());

    }
}
