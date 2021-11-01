package Aula05a;

public class Aula05a {

    public static void main(String[] args) {

        IngressoNormal normal = new IngressoNormal();
        IngressoVIP vip = new IngressoVIP();
        CamaroteSuperior camSup = new CamaroteSuperior();

        normal.imprimeValor();
        vip.imprimeValor();
        camSup.imprimeValor();

    }
}
