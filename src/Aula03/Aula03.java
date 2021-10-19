package Aula03;

public class Aula03 {

    public static void main(String[] args) {

        Carro meuCarro = new Carro("PASSEIO", "PRETO", "GGG-1111", 4);
        Carro meuOutroCarro = new Carro("PASSEIO", "BRANCO", "IXI-4585", 2);

        Pessoa pessoa = new Pessoa("Wellington", "Castanho",
                "precisaseexercitar", 25);

        meuCarro.setDono(pessoa);

        System.out.print(meuCarro.toString() + "{ Dono= " + meuCarro.getDono().getNome() + "}\n");
        System.out.println(pessoa.toString());
    }
}
