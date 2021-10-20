package Aula04;

public class Emprestimo {

    private String data, hora;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(String data, String hora, Livro livro, Usuario usuario) {
        this.data = data;
        this.hora = hora;
        this.livro = livro;
        this.usuario = usuario;
    }

    public String devolverLivro(){
        this.livro.setEmprestimo(true);
        return "Livro devolvido";
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
