package Projeto_final;

public class LivroEstrangeiro extends Livro {

    private String idioma;


    public LivroEstrangeiro() {

    }

    public LivroEstrangeiro(String titulo, String autor, String genero, String idioma) {
        super(titulo, autor, genero);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
