package Lista01ex01;

public class Funcionario {

    protected String nome;
    protected double salario;

    public void addAumento(double valor){
        this.salario += valor;
    }

    public double ganhoAnual(){
        return salario * 12;
    }

    public String exibeDados(){
        return "Nome: " + nome + "\nSalário R$" + salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
