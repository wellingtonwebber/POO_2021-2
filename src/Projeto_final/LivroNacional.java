package Projeto_final;

public class LivroNacional extends Livro {

    private String regiao;

    public LivroNacional() {

    }

    public LivroNacional(String titulo, String autor, String genero, String regiao) {
        super(titulo, autor, genero);
        this.regiao = regiao;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
}
