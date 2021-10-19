package Aula02;

public class Main {

    public static void main(String[] args) {

        Carro meuCarro = new Carro("PASSEIO", "PRETO", "GGG-1111", 4);

        System.out.println(meuCarro.toString());

        Pessoa pessoa = new Pessoa("Wellington", "Castanho",
                                    "precisaseexercitar", 25);

        System.out.println(pessoa.toString());

    }
}
