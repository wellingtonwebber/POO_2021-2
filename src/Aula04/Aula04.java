package Aula04;

public class Aula04 {

    public static void main(String[] args) {

        Usuario aluno = new Usuario("Maria", 18, "F", "995452146");
        Livro l1 = new Livro("POO avançado", "Joao da silva", "Tecnologia", "SaberMais",
                            2016, 2,512);

        Emprestimo e1 = new Emprestimo("19/10/2021", "12:45", l1, aluno);

        //System.out.println(l1.toString());
        //System.out.println(aluno.toString());
        //System.out.println("Data e hora do empréstimo= " + e1.getData() + " - " + e1.getHora());

        System.out.println("Livro: " + e1.getLivro().getTitulo());
        System.out.println("Usuário: " + e1.getUsuario().getNome());
        System.out.println("Data: " + e1.getData());
        System.out.println(e1.getLivro().abrirLivro());
        System.out.println(e1.getUsuario().lerLivro(e1.getLivro()));
        System.out.println(e1.getLivro().fecharLivro());
        System.out.println(e1.devolverLivro());
    }
}
