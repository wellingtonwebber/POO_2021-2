package Aula04;

public class Livro {
    private String titulo, autor, area, editora;
    private int ano, edicao, numeroFolhas;
    private boolean emprestimo;

    public Livro(String titulo, String autor, String area, String editora, int ano, int edicao, int numeroFolhas) {
        this.titulo = titulo;
        this.autor = autor;
        this.area = area;
        this.editora = editora;
        this.ano = ano;
        this.edicao = edicao;
        this.numeroFolhas = numeroFolhas;
        this.emprestimo = false;
    }

    public String abrirLivro(){
        return "O livro está aberto para leitura";
    }

    public String fecharLivro(){
        return "O livro está fechado para leitura";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getNumeroFolhas() {
        return numeroFolhas;
    }

    public void setNumeroFolhas(int numeroFolhas) {
        this.numeroFolhas = numeroFolhas;
    }

    public boolean isEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", area='" + area + '\'' +
                ", editora='" + editora + '\'' +
                ", ano=" + ano +
                ", edicao=" + edicao +
                ", numeroFolhas=" + numeroFolhas +
                '}';
    }
}
