package Aula02;

public class Pessoa {

    private String nome, corDoCabelo, biotipo;
    private int idade;

    public Pessoa(String nome, String corDoCabelo, String biotipo, int idade) {
        this.nome = nome;
        this.corDoCabelo = corDoCabelo;
        this.biotipo = biotipo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorDoCabelo() {
        return corDoCabelo;
    }

    public void setCorDoCabelo(String corDoCabelo) {
        this.corDoCabelo = corDoCabelo;
    }

    public String getBiotipo() {
        return biotipo;
    }

    public void setBiotipo(String biotipo) {
        this.biotipo = biotipo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", corDoCabelo='" + corDoCabelo + '\'' +
                ", biotipo='" + biotipo + '\'' +
                ", idade=" + idade +
                '}';
    }
}